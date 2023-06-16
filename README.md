# **MY FLIGHT**

## **Team**

| Name   | ID | University |
| :------------ |:---------------:| ------:|
| Muhammad Rizal Zuhdi    | (ML) M151DSX2521 |Brawijaya University|
|  Laila Nur Azizah    | (ML) M151DSY2367  |Brawijaya University|
| Sharira Saniane      | (CC) C038DSY0763 | Sepuluh Nopember Institute of Technology (ITS)|
| Salsabila Briliana Ananda Sofi    | (CC) C038DSY0851 | Sepuluh Nopember Institute of Technology (ITS)|
|  Audry Jesica Putri    | (MD) A360DSY1032  |Telkom University|
<br/>

# My Flight 
My flight application is an application that will make it easier for flight service users because one of its main features is to provide information about departure delays in real-time. My flight also has features such as flight schedules, aircraft trackers, and other information.


## Technologies Used
* [NodeJs](https://nodejs.org/en) : Node. js is an open-source, cross-platform JavaScript runtime environment and library for running web applications outside the client's browser.
* [ExpressJS](https://expressjs.com/) : Express is a node js web application framework that provides broad features for building web and mobile applications. It is used to build a single page, multipage, and hybrid web application.
* [firebase](https://firebase.google.com/?hl=id) : Firebase is a comprehensive mobile and web development platform provided by Google. It offers a range of services and tools that help developers build and deploy high-quality applications quickly and easily. 



# Machine Learning 

### Creating Model

**Model** 
![model1](./Image/model%20sequential%20.jpg)

**Accuracy and Loss Model Diagram** 
![model2](./Image/modelaccuracy1.jpg)
![model3](./Image/model%20loss.jpg)

### Output model data : 
```
  'On time': 0,
        'Delay (10 - 30 menit)': 1,
        'Delay (30 - 60 menit)': 2,
        'Delay < 10 menit': 3
```



# Cloud Computing 
The cloud architecture used is as follows :

![cloud](./Image/cloud.png)

## Link Deploy 
`https://my-flight-388317.et.r.appspot.com`

## **End Point**
## 1. Predict
### `POST`
#### 1.  `/(link deploy) /predict` <br>
**Body Request**    :  temperature, percentage_wind, percentage_cloud, duration_of_flight <br>
***Authorization*** : -  <br>
**Response** :
```JSON
{
    "prediction": 1
}
```

# Mobile Development
 
## **Mockup Aplikasi** 

![mockup](Image/ui%20app.png)
