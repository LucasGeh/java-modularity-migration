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

}
