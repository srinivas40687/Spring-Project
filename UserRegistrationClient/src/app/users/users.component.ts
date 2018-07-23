import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { DataService } from '../data.service';

@Component({
  selector: 'users-list',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css'],
})

export class CustomersComponent implements OnInit {
  users: User[];
  selectedUser: User;

  constructor(private dataService: DataService) {}

  getUsers() {
     this.dataService.getUsers().then(users => this.users = users);
  }

  ngOnInit(): void {
     this.getUsers();
  }

  onSelect(us: User): void {
    this.selectedUser = us;
  }
}