package service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Interface for discovering and loading all services
 */
public interface AdminService {
    public void printServiceInfo();

    public void retrieveData();

    public static List<AdminService> newInstance(){
        ServiceLoader<AdminService> service=ServiceLoader.load(AdminService.class);
        List<AdminService> list = new ArrayList<>();
        for(AdminService inter:service){
            list.add(inter);
        }
        return list;
    }

}
