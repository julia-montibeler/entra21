import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SizerComponent } from './sizer/sizer.component';
import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { HeaderComponent } from './header/header.component';
import { HighlightComponent } from './highlight/highlight.component';
import { HeroesScreenComponent } from './heroes/heroes-screen/heroes-screen.component';
import { HeroesModule } from './heroes/heroes.module';
import { FavoriteColorComponent } from './favorite-color/favorite-color.component';
import {ReactiveFormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    HeaderComponent,
    HighlightComponent,
    SizerComponent,
    FavoriteColorComponent
  ],
  imports: [
    BrowserModule, 
    HeroesModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }