import React, { useState, useEffect } from "react";
import "./App.css";
import { API_ENDPOINT } from "./config";
import ItemDetail from "./ItemDetail";
import Nav from "./Nav";

var prvakliknuta = null;
var druhakliknuta = null;
var Boxklicked = false;

function Item() {
  useEffect(() => {
    fetchItem();
  }, []);

  function handleChange(event) {
    setScroolbar(event.target.value);
    fetchItem(jazyk);
  }

  const [wortsallrandom, setWortsallrandom] = useState([]);
  const [scroolbar, setScroolbar] = useState(20);
  const [jazyk, setSprache] = useState("sk");

  const handleSpracheChange = async (event) => {
    switch (event.target.id) {
      case "DESK":
        fetchItem("sk");
        break;
      case "DEEN":
        fetchItem("en");
        break;
      case "DEENSK":
        fetchItem("sken");
        break;
    }
  };

  const fetchItem = async (jazyk = "sk") => {
    const fetchItem = await fetch(`${API_ENDPOINT}/api/pexeso/all/${jazyk}`);
    let items = await fetchItem.json();
    console.log("Fecovacia funkcia mi vratila", jazyk);
    items = random_item(items, scroolbar);

    let worts = [];
    var i;
    var c = 0;
    for (i = 0; i < items.length; i++) {
      worts.push({
        key: items[i].id,
        name: items[i].wort,
        id: c++,
        Boxklicked: false,
      });
      worts.push({
        key: items[i].id,
        name: items[i].wortde,
        id: c++,
        Boxklicked: false,
      });
    }

    setSprache(jazyk);
    setWortsallrandom(random_item(worts, worts.length));
  };

  function random_item(items, n = 10) {
    const shuffled = items.sort(() => 0.5 - Math.random());

    let selected = shuffled.slice(0, n);

    return selected;
  }

  function WortClick(wort) {
    if (prvakliknuta === wort) {
      var datas = wortsallrandom.map((worts) => {
        if (worts.id === prvakliknuta.id) {
          worts.Boxklicked = false;
        }
        return worts;
      });

      setWortsallrandom(datas);

      prvakliknuta = null;
      return;
    }

    if (prvakliknuta !== null && druhakliknuta === null) {
      druhakliknuta = wort;
      var datas = wortsallrandom.map((worts) => {
        if (worts.id === druhakliknuta.id) {
          worts.Boxklicked = true;
        }
        return worts;
      });

      setWortsallrandom(datas);
    }

    if (prvakliknuta === null) {
      prvakliknuta = wort;

      var datas = wortsallrandom.map((worts) => {
        if (worts.id === prvakliknuta.id) {
          worts.Boxklicked = true;
        }
        return worts;
      });

      setWortsallrandom(datas);
    }

    if (
      prvakliknuta != null &&
      druhakliknuta != null &&
      prvakliknuta.key === druhakliknuta.key
    ) {
      var datas = wortsallrandom.map((worts) => {
        if (worts.id === druhakliknuta.id) {
          worts.Boxklicked = true;
        }
        return worts;
      });

      setWortsallrandom(datas);

      var data = wortsallrandom.filter(function (item) {
        return item.key !== prvakliknuta.key && item.key !== druhakliknuta.key;
      });
      prvakliknuta = null;
      druhakliknuta = null;

      setTimeout(() => {
        setWortsallrandom(data);
      }, 250);
    }

    if (
      prvakliknuta != null &&
      druhakliknuta != null &&
      prvakliknuta.key !== druhakliknuta.key
    ) {
      var datass = wortsallrandom.map((worts) => {
        if (worts.id === prvakliknuta.id) {
          worts.Boxklicked = false;
        }

        if (worts.id === druhakliknuta.id) {
          worts.Boxklicked = true;
        }

        return worts;
      });

      setWortsallrandom(datass);

      prvakliknuta = wort;
      druhakliknuta = null;
    }
  }

  return (
    <div className="block">
      <Nav
        WortClick2={(ev) => fetchItem(jazyk)}
        Scroolbarfunc={handleChange}
        WortClickDESKEN={handleSpracheChange}
      />
      {wortsallrandom.map((wort) => {
        return (
          <div key={wort.id} className="recipes">
            <ItemDetail
              wort={wort.name}
              schlussel={wort.key}
              id={wort.id}
              WortClick={WortClick.bind(null, wort)}
              isBoxklicked={wort.Boxklicked}
            />
          </div>
        );
      })}
    </div>
  );
}

export default Item;
