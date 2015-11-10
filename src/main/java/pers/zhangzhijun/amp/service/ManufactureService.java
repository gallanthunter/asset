package pers.zhangzhijun.amp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.zhangzhijun.amp.domain.Manufacturer;
import pers.zhangzhijun.amp.dto.ManufacturerDTO;
import pers.zhangzhijun.amp.repository.ManufacturerRepository;

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
    ManufacturerRepository manufacturerRepository;

    public void createManufacture(ManufacturerDTO manufacturerDTO){
        Manufacturer manufacturer;
        if (manufacturerDTO.getName() == null){
            logger.error("Manufacturer name cannot be null!");
        }
        manufacturer = convertManufacturerDTOToManufacturet(manufacturerDTO);
        manufacturerRepository.save(manufacturer);
    }

    public ManufacturerDTO queryManufacture(String name) {
        if (name == null) {
            logger.error("Manufacturer name cannot be null!");
        }
        Manufacturer manufacturer = manufacturerRepository.findByName(name);
        return convertManufactureToManufacturetDTO(manufacturer);
    }

    public void updateManufacture(ManufacturerDTO manufacturerDTO){
        Manufacturer manufacturer;
        if (manufacturerDTO.getId() == null){
            logger.error("A manufacturer must be chosed!");
        }
        manufacturer = convertManufacturerDTOToManufacturet(manufacturerDTO);
        manufacturerRepository.save(manufacturer);
    }

    public void deleteManufacture(ManufacturerDTO manufacturerDTO){
        Manufacturer manufacturer;
        if (manufacturerDTO.getId() == null){
            logger.error("A manufacturer must be chosed!");
        }
        manufacturer = convertManufacturerDTOToManufacturet(manufacturerDTO);
        manufacturerRepository.delete(manufacturer);
    }

    public Manufacturer convertManufacturerDTOToManufacturet(ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(manufacturerDTO.getId());
        manufacturer.setName(manufacturerDTO.getName());
        manufacturer.setDescription(manufacturerDTO.getDescription());

        return manufacturer;
    }

    public ManufacturerDTO convertManufactureToManufacturetDTO(Manufacturer manufacturer) {
        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();
        manufacturerDTO.setId(manufacturer.getId());
        manufacturerDTO.setName(manufacturer.getName());
        manufacturerDTO.setDescription(manufacturer.getDescription());

        return manufacturerDTO;
    }
}
