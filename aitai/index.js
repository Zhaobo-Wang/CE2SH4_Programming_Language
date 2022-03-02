import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'antd/dist/antd.min.css';
import { configureStore } from '@reduxjs/toolkit';
import { Provider } from 'react-redux';
import dataReducer from './feature/data';
import columnReducer from './feature/column';
import areaReducer from './feature/area';

export const store = configureStore({
  reducer: { data: dataReducer, column: columnReducer, area: areaReducer }
})

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
