package giaphat.lab3.services;

import giaphat.lab3.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import giaphat.lab3.entity.User;
import giaphat.lab3.repository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;

    public void save(User user) {
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if (roleId !=0 && userId !=0) {
            userRepository.addRoleToUser(userId,roleId);
        }
    }



}
