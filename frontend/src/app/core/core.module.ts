import { NgModule } from '@angular/core';
import { IonicModule } from 'ionic-angular';
import { HttpModule } from '@angular/http';
import { TabsPage } from './pages/tabs/tabs';
import { HomePage } from './pages/home/home';
import { SettingsPage } from './pages/settings/settings';
import { PeopleService } from './services/people';

@NgModule({
  declarations: [
    TabsPage,
    HomePage,
    SettingsPage
  ],
  imports: [
    IonicModule.forRoot(TabsPage),
    HttpModule
  ],
  entryComponents: [
    TabsPage,
    HomePage,
    SettingsPage
  ],
  providers: [
    PeopleService
  ]
})
export class CoreModule {}
