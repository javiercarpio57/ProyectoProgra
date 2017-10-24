import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IngresarPage } from './ingresar';

@NgModule({
  declarations: [
    IngresarPage,
  ],
  imports: [
    IonicPageModule.forChild(IngresarPage),
  ],
})
export class IngresarPageModule {}
