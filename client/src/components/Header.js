import React from "react";
//import { Component } from 'react';
import axios from "axios";
import { useState } from "react";
import { JsonToTable } from "react-json-to-table";

const sample = [
  {
    payerAccount: "200001020112",
    payeeAccount: "200001020919",
    transactionRef: "123452359012",
    amount: "9993.00",
    payerName: "AnilMehtanin",
    transactionDate: "02012018",
    payeeName: "KanyaKaur",
    validations: "pass",
    screening: "pass",
    transactionId: "2",
  },
  {
    payerAccount: "200001060111",
    payeeAccount: "200001520999",
    transactionRef: "156456789012",
    amount: "329.00",
    payerName: "VimalSukumar",
    transactionDate: "02012018",
    payeeName: "MohiniChawal",
    validations: "pass",
    screening: "pass",
    transactionId: "6",
  },
];

function Header() {
  return (
    <div className="header">
      <div className="row" style={{ paddingTop: "20px" }}>
        <div className="col-2"></div>
        <div className="col-2">
          <button type="button" className="btn btn-outline-primary">
            Screen-pass
          </button>
        </div>
        <div className="col-2">
          <button type="button" className="btn btn-outline-primary">
            Screen-Fail
          </button>
        </div>
        <div className="col-2">
          <button type="button" className="btn btn-outline-primary">
            Validate-Pass
          </button>
        </div>
        <div className="col-2">
          <button type="button" className="btn btn-outline-primary">
            Validate-Fail
          </button>
        </div>
        <div className="col-2"></div>
      </div>
      <div className="row" style={{ paddingTop: "40px", paddingleft: "40px" }}>
        {/* <JsonToTable json={sample} /> */}
        <table class="table table-striped">
          <thead>
            <tr>
              <th></th>
              <th scope="col">Payer Account</th>
              <th scope="col">Payee Account</th>
              <th scope="col">Transaction Ref</th>
              <th scope="col">Amount</th>
              <th scope="col">Payer Name</th>
              <th scope="col">Transaction Date</th>
              <th scope="col">Payee Name</th>
              <th scope="col">Transaction Id</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>200001020111</td>
              <td>200001020099</td>
              <td>123456789012</td>
              <td>9999.90</td>
              <td>VickeyMickey</td>
              <td>02012018</td>
              <td>KamleshPatel</td>
              <td>1</td>
            </tr>
            <tr>
              <th scope="row">1</th>
              <td>200001020113</td>
              <td>200001020992</td>
              <td>123456789019</td>
              <td>999.00</td>
              <td>NarayananIyer</td>
              <td>25312018</td>
              <td>AshwiniKumari</td>
              <td>3</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>200001020141</td>
              <td>200001020939</td>
              <td>123456789001</td>
              <td>1256.00</td>
              <td>KamalNathan</td>
              <td>12252018</td>
              <td>SunainaPatil</td>
              <td>4</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td>200001020115</td>
              <td>200001020994</td>
              <td>123456789012</td>
              <td>500.00</td>
              <td>"VijSavrani</td>
              <td>02962018</td>
              <td>TestUser1</td>
              <td>5</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default Header;

/*git init
git add README.md
git commit -m "second commit"
git branch -M main
git remote add origin https://github.com/bhakti0302/CitiBridge.git
git push -u origin main*/
