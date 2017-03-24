import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ClarityModule } from 'clarity-angular'
import { AppComponent }  from './app.component';
import {login} from "./app.component.desktop";

@NgModule({
  imports:      [
    BrowserModule,
    ClarityModule.forRoot()
  ],
  declarations: [ AppComponent ],
  bootstrap:    [ login ]
})
export class AppModule { }
