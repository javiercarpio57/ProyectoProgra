import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RegistrarsePage } from './registrarse';

@NgModule({
  declarations: [
    RegistrarsePage,
  ],
  imports: [
    IonicPageModule.forChild(RegistrarsePage),
  ],
})
export class RegistrarsePageModule {}
