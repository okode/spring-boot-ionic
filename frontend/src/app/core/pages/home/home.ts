import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Person } from '../../models/person';
import { PeopleService } from '../../services/people';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  people: Person[];

  constructor(public navCtrl: NavController, public peopleService: PeopleService) { }

  refreshPeople() {
    this.peopleService.findAll().subscribe(people => {
      this.people = people;
    })
  }

}
