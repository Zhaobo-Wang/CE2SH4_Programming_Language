import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import { Radio } from 'antd';
import Charts from './component/Charts';
import Tables from './component/Tables';
import Lines from './component/Lines';
import './App.css';

const App = () => {

  return (
    <div className='App'>
      <div className='top'>
        <Charts />
        <Lines />
      </div>
      <div className="middle">
        <Radio.Group>
          <Radio value='seasons'>季报</Radio>
          <Radio value='years'>年报</Radio>
        </Radio.Group>
      </div>
      <div className="bottom">
        <Tables />
      </div>
    </div>
  );
};

export default App;