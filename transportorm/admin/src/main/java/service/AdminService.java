package service;

import java.util.ServiceLoader;

/**
 * Interface for discovering and loading all services
 */
public interface AdminService {
    public void printServiceInfo();

    public static AdminService newInstance(){
        ServiceLoader<AdminService> service=ServiceLoader.load(AdminService.class);
        for(AdminService inter:service){
            return inter;
        }
        return null;

    }

}
