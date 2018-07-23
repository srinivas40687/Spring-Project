import {Component, OnInit} from '@angular/core';
import {Customer} from '../user';
import {DataService} from '../data.service';

@Component({
  selector: 'app-search-users',
  templateUrl: './search-users.component.html',
  styleUrls: ['./search-users.component.css']
})

export class SearchUsersComponent implements OnInit {
  lastName: string;
  users: User[];
  
  constructor(private dataService: DataService) {}

  ngOnInit() {
    this.lastName = "";
  }

  private searchusers() {
    this.dataService.getUsersByLastName(this.lastName).then(users => this.users = users);
  }

  onSubmit() {
    this.searchUsers();
  }

}
