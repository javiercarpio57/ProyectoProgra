import { NgModule, ErrorHandler } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';



import { InicioPage } from '../pages/inicio/inicio';
import { RegistrarsePage } from '../pages/registrarse/registrarse';
import { IngresarPage } from '../pages/ingresar/ingresar';
import { AboutPage } from '../pages/about/about';
import { ContactPage } from '../pages/contact/contact';
import { HomePage } from '../pages/home/home';
import { TabsPage } from '../pages/tabs/tabs';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { Asistencia } from '../services/Asistencia'

import { AngularFireModule } from 'angularfire2';
import { AngularFireAuthModule } from 'angularfire2/auth';
import { AngularFireDatabaseModule } from 'angularfire2/database'
import { FirebaseService } from '../services/FirebaseService';

import { GoogleMaps } from '@ionic-native/google-maps';

import { Geolocation } from '@ionic-native/geolocation';

//Base de datos
const firebaseAuth={
  apiKey: "AIzaSyB0S0KmUN8JlDp6IDdbiAUDc_QBt-u_-ek",
  authDomain: "proyecto-1ae80.firebaseapp.com",
  databaseURL: "https://proyecto-1ae80.firebaseio.com",
  projectId: "proyecto-1ae80",
  storageBucket: "proyecto-1ae80.appspot.com",
  messagingSenderId: "1329715655"
};




@NgModule({
  declarations: [
    MyApp,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    InicioPage,
    RegistrarsePage,
    IngresarPage,    
    
    

  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    AngularFireModule.initializeApp(firebaseAuth),
    AngularFireAuthModule,
    AngularFireDatabaseModule
    
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    InicioPage,
    RegistrarsePage,
    IngresarPage
    
    
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    FirebaseService,
    GoogleMaps,
    Geolocation,
    Asistencia 

  ]
})
export class AppModule {}
