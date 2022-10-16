//alert();

let btn = document.getElementById("btn");
btn = addEventListener("click",btnHandler);

function btnHandler(){
    console.log("working....");

    let xhr = new XMLHttpRequest();

    xhr.open("GET","https://restcountries.com/v2/all",true);

    xhr.onprogress = function () {
        console.log("Please wait...loading!");
    }

    xhr.onreadystatechange = function () {
        console.log("Ready state is: "+xhr.readyState);
    }

    xhr.onload = function () {
        if(this.status==200)
        {
            console.log("Success..");

            const countries = JSON.parse(this.response);
            console.log(countries);

            countries.forEach(countries => {
                const countryCard = document.createElement("div");
                countryCard.innerHTML = countries.name;
                const countryCardImg = document.createElement("img");
                countryCardImg.src = countries.flag;
               // const countryCardCap = document.createElement("div");
               //countryCard.innerHTML = countries.capital;
                document.getElementById('feed').appendChild(countryCard);
                //document.getElementById('cap').appendChild(countryCardCap);
                countryCard.appendChild(countryCardImg);
            });

            // if(countries>0)
            // {
            //     const str = ``;
            //     for(result of countries)
            //     {
            //         str=str+`
            //             <div class="col-xl-3">
            //                 <img src="${result.flag}" class="img-fluid" alt="">
            //                 <h2>${result.name}</h2>
            //                 <p>${result.capital}</p>
            //             </div>
            //         `;
            //     }
            //     document.querySelector(".row").innerHTML=str;
            // }
        }
    }
    xhr.send();
}