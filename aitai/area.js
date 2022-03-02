import { createSlice } from "@reduxjs/toolkit";
import { BarChartOutlined } from '@ant-design/icons';
import { Button } from 'antd';
import React, { useState } from 'react';


const initialStateValue = [
    {
        key: '0',
        name: <Button
            value='area'
            icon={<BarChartOutlined />}
            >
            地区
        </Button>,
    }
    , {
        key: '1',
        name: '上海',
        Value2019Q2: '30.9%',
        Value2019Q3: '23.4%',
        Value2019Q4: '23.5%',
        Value2020Q1: '26.9%',
        Value2020Q2: '29.6%',
        Value2020Q3: '29.6%',
        Value2020Q4: '29.6%',
        Value2021Q1: '29.6%',
    },
    {
        key: '2',
        name: '北京',
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
        name: '广州',
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


export const areaSlice = createSlice({
    name: 'area',
    initialState: { value: initialStateValue },
    reducers: {
        add: (state, action) => {
            state.value = action.payload;
        }
    }
})

export default areaSlice.reducer;
export const { add } = areaSlice.actions;