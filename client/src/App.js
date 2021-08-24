import React from "react";
import FileUpload from "./components/FileUpload";
import "./App.css";
import Header from "./components/Header";
const App = () => (
  <div
    style={{
      paddingLeft: "2%",
      paddingRight: "2%",
      // backgroundColor: "#cce6ff",

      // backgroundImage:
      //   'url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSIRR6A7ZwqiM_DW-56eTWrmr6ISsEQ2Ju7Q&usqp=CAU")',
      // backgroundRepeat: "no-repeat",
      // backgroundPosition: "center",
      // backgroundSize: "cover",
      //background-size: "cover",background-position:" center center"

      //'url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSIRR6A7ZwqiM_DW-56eTWrmr6ISsEQ2Ju7Q&usqp=CAU")',
    }}
  >
    <h3 className="display-5 text-center mb-4">
      Sanctions Screening of Payments Transactions
    </h3>

    <FileUpload />
    <div style={{ paddingTop: "10px" }}>
      <Header />
    </div>
  </div>
);

export default App;
