import {Component, OnInit} from 'angular2/core';
import {CORE_DIRECTIVES} from 'angular2/common';
import {Observable} from 'rxjs/Observable';
import 'rxjs/Rx';
import {Ville} from './ville';
import {Transport} from './transport';
import {Service} from './service';
import {DtypeFilterPipe} from './transport.pipe';

@Component({
    selector: 'resanet',
    templateUrl: 'app/resanet.html',
    directives: [CORE_DIRECTIVES],
    providers: [Service],
    pipes: [DtypeFilterPipe]
})
export class Resanet implements OnInit {

    title = 'Resanet';
    transports: Transport[];
    selectedTransports: Transport[];
    villes: Ville[];
    selectedTransport: Transport;
    newTransport: Transport;

    onSelect(transport: Transport) {
        this.selectedTransport = transport;
        this.getTransportsTime(this.selectedTransport.villeDepart.id, this.selectedTransport.villeArrivee.id, this.transports);
        //console.log(this.selectedTransports);
    }

    constructor(private service: Service) { }

    ngOnInit() {
        this.getVilles();
        this.getTransports();
    }

    getVilles() {
        this.service.getVilles()
            .subscribe(
            villes => {
                this.villes = villes;
            },
            error => console.log(error)
            );
    }

    getTransports() {
        this.service.getTransports()
            .subscribe(
            transports => {
                this.transports = transports;
            },
            error => console.log(error)
            );
    }

    getTransportsTime(ville_d: number, ville_a: number, transports: Transport[]) {
        this.service.getTransportsTime(ville_d, ville_a, transports)
            .subscribe(
            transports => {
                this.selectedTransports = transports;
            },
            error => console.log(error)
            );
    }

    addForm(value: any) {
        console.log(value);
    }
}