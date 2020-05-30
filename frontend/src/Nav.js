import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";

export default function Nav({ WortClick2, Scroolbarfunc, WortClickDESKEN }) {
  return (
    <div className="container">
      <div className="row">
        <nav className="navbar navbar-dark fixed-top bg-danger text-white">
          <div className="titel">Pexeso für alle</div>
          <div className="button-div">
            <a className="button1" onClick={WortClick2}>
              Nächster
            </a>
            <a className="button2" onClick={WortClickDESKEN} id="DESK">
              DE + SK
            </a>
            <a className="button3" onClick={WortClickDESKEN} id="DEEN">
              DE + EN
            </a>
            <a className="button4" onClick={WortClickDESKEN} id="DEENSK">
              DE + EN + SK
            </a>
          </div>
          <input
            type="range"
            className="custom-range"
            min="0"
            max="100"
            step="1"
            defaultValue="20"
            id="customRange2"
            onChange={Scroolbarfunc}
          />
          <label for="customRange1">die Menge</label>
        </nav>
      </div>
    </div>
  );
}
