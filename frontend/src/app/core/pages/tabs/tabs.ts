import { Component } from '@angular/core';

import { HomePage } from '../home/home';
import { SettingsPage } from '../settings/settings';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tabHome = HomePage;
  tabSettings = SettingsPage;

  constructor() { }

}