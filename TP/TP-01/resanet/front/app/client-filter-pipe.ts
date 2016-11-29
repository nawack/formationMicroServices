import {PipeTransform, Pipe} from 'angular2/core';

@Pipe({name: 'clientFilter'})
export class ClientFilterPipe implements PipeTransform {
    transform(clients: Client[], args: string[]): Client[] {
        return clients ? clients.filter(function(client){
            var filter = (args[0] || "").toLowerCase();
            return client.name.toLowerCase().search(filter) != -1
                || client.machine.toLowerCase().search(filter) != -1;
        }) : [];
    }
}

