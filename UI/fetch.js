// fetch("https://reqres.in/api/users?page=2")
//   .then((res) => res.json())
//   .then((res) => console.log(res))
//   .catch(err => console.log(err))

const { error } = require("console");

const fetchUserInfo = async () => {
  try {
    const response = await fetch("https://reqres.in/api/users?page=2");

    const userData = await response.json(); //parsing json response

    console.log(userData);
  } catch (error) {
    console.log(error.message + " " + error);
  }
};

// fetchUserInfo()

// fetch("https://reqres.in/api/users", { //Using a promise
//   method: "POST",
//   body: JSON.stringify({ job: "Manager", name: "Peter Parker" }),
//   headers: {
//     "Content-Type": "application/json",
//   },
// })
//   .then((response) => response.json())
//   .then((data) => console.log("Request created : ", data))
//   .catch(error => console.error('Error', error))

 const postData = ( async function () { //using async and await
  try {
    const response = await fetch("https://reqres.in/api/users", {
      method: "POST",
      body: JSON.stringify({ job: "Manager", name: "Peter Parker" }),
      headers: {
        "Content-Type": "application/json",
      },
    })

    const result = await response.json();
    console.log(result);
  } catch (error) {
    console.error("Error is : ", error);
  }
} ) ()

postData
