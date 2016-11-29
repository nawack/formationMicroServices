import {Injectable} from 'angular2/core';
import {Observable} from 'rxjs/Observable';
import {Http, Response, Headers, RequestOptions, HTTP_PROVIDERS} from 'angular2/http';

@Injectable()
export class Service {
    constructor (private http: Http) {}

    getVilles() {
        return this.http.get("http://localhost:8000/ville").map(res => <Ville>res.json());
    }

    getTransports() {
		return this.http.get("http://localhost:8000/transport").map(res => <Transport>res.json());
    }

    getTransportsTime(ville_d: number, ville_a: number, transports: Transport[]) {
		return Observable.from(transports)
			.filter(jsonObj => jsonObj.villeDepart.id == ville_d)
			.filter(jsonObj => jsonObj.villeArrivee.id == ville_a)
			.toArray();
    }
}
