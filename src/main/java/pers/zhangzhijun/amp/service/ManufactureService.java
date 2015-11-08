package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.Manufacture;
import pers.zhangzhijun.amp.dto.ManufactureDTO;
import pers.zhangzhijun.amp.repository.ManufactureRepository;

/**
 * ClassName: pers.zhangzhijun.amp.service
 * Function :
 * Author   : ZhangZhijun
 * Date     : 0:05
 * Since    : v1.0.0
 */
@Service
public class ManufactureService {
    private Logger logger = LoggerFactory.getLogger(ManufactureService.class);

    @Autowired
    ManufactureRepository manufactureRepository;

    public void createManufacture(ManufactureDTO manufactureDTO){
        Manufacture manufacture;
        if (manufactureDTO.getName() == null){
            logger.error("Manufacture name cannot be null!");
        }
        manufacture = convertManufactureDTOToManufacturet(manufactureDTO);
        manufactureRepository.save(manufacture);
    }

    public ManufactureDTO queryManufacture(String name) {
        if (name == null) {
            logger.error("Manufacture name cannot be null!");
        }
        Manufacture manufacture = manufactureRepository.findByName(name);
        return convertManufactureToManufacturetDTO(manufacture);
    }

    public void updateManufacture(ManufactureDTO manufactureDTO){
        Manufacture manufacture;
        if (manufactureDTO.getId() == null){
            logger.error("A manufacture must be chosed!");
        }
        manufacture = convertManufactureDTOToManufacturet(manufactureDTO);
        manufactureRepository.save(manufacture);
    }

    public void deleteManufacture(ManufactureDTO manufactureDTO){
        Manufacture manufacture;
        if (manufactureDTO.getId() == null){
            logger.error("A manufacture must be chosed!");
        }
        manufacture = convertManufactureDTOToManufacturet(manufactureDTO);
        manufactureRepository.delete(manufacture);
    }

    public Manufacture convertManufactureDTOToManufacturet(ManufactureDTO manufactureDTO) {
        Manufacture manufacture = new Manufacture();
        manufacture.setId(manufactureDTO.getId());
        manufacture.setName(manufactureDTO.getName());
        manufacture.setDescription(manufactureDTO.getDescription());

        return manufacture;
    }

    public ManufactureDTO convertManufactureToManufacturetDTO(Manufacture manufacture) {
        ManufactureDTO manufactureDTO = new ManufactureDTO();
        manufactureDTO.setId(manufacture.getId());
        manufactureDTO.setName(manufacture.getName());
        manufactureDTO.setDescription(manufacture.getDescription());

        return manufactureDTO;
    }
}
