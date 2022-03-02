import { createSlice } from "@reduxjs/toolkit";
import { BarChartOutlined } from '@ant-design/icons';
import { Button } from 'antd';
import React, { useState } from 'react';


const initialStateValue = [
    {
        key: '0',
        name: <Button icon={<BarChartOutlined />}>产品</Button>,
    }
    , {
        key: '1',
        name: '产品线A1',
        Value2019Q2: '28.9%',
        Value2019Q3: '35.4%',
        Value2019Q4: '23.5%',
        Value2020Q1: '26.9%',
        Value2020Q2: '29.6%',
        Value2020Q3: '29.6%',
        Value2020Q4: '29.6%',
        Value2021Q1: '29.6%',
    },
    {
        key: '2',
        name: '产品线A2',
        Value2019Q2: '28.9%',
        Value2019Q3: '35.4%',
        Value2019Q4: '23.5%',
        Value2020Q1: '26.9%',
        Value2020Q2: '29.6%',
        Value2020Q3: '29.6%',
        Value2020Q4: '29.6%',
        Value2021Q1: '29.6%',
    },
    {
        key: '3',
        name: '产品线A3',
        Value2019Q2: '28.9%',
        Value2019Q3: '35.4%',
        Value2019Q4: '23.5%',
        Value2020Q1: '26.9%',
        Value2020Q2: '29.6%',
        Value2020Q3: '29.6%',
        Value2020Q4: '29.6%',
        Value2021Q1: '29.6%',
    }
]



export const dataSlice = createSlice({
    name: 'data',
    initialState: { value: initialStateValue },
    reducers: {
        add: (state, action) => {
            state.value = action.payload;
        }
    }
})

export default dataSlice.reducer;
export const { add } = dataSlice.actions;