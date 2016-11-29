interface Transport {
	dtype: string;
    id: number;
    version: number;
    date_depart: string;
    heure_arrivee: string;
    heure_depart: string;
    nb_sieges_dispo: number;
    nb_sieges_total: number;
    prix: number;
    nb_wagons: number;
    voiture_bar: boolean;
    compagnie: string;
    type_appareil: string;
    ville_a: any;
    ville_d: any;
}