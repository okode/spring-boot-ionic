import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';
import { Person } from '../models/person';
import { isDevMode } from '@angular/core';
import 'rxjs/add/operator/map';

@Injectable()
export class PeopleService {

  // Release mode
  baseURL = '';

  constructor(public http: Http) {
    // Debug mode
    if (isDevMode()) this.baseURL = 'http://localhost:8080/';
  }

  findOne(id: number): Observable<Person> {
    let url = `${this.baseURL}people/${id}`;
    return this.http.get(url).map(res => <Person>(res.json()));
  }

  findAll(): Observable<Person[]> {
    let url = `${this.baseURL}people`;
    return this.http.get(url).map(res => <Person[]>(res.json()));
  }

}
