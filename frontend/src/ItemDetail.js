import React, { useState, useEffect } from "react";
import "./App.css";
import style from "./ItemDetail.module.css";

function ItemDetail({ wort, schlussel, WortClick, id, isBoxklicked }) {
  return (
    <div>
      <div
        className={
          isBoxklicked ? style.background_green : style.background_white
        }
        id={id}
        onClick={WortClick}
        value={schlussel}
      >
        {wort}
      </div>
    </div>
  );
}

export default ItemDetail;
