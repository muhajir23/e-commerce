
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import model.PakaianModel;

/**
 *
 * @author cyber23
 */
public interface PakaianInterface {
    public void insert(PakaianModel p);
    public PakaianModel getByIdOrNama(String kdBrg,String nmBrg);
    public List<PakaianModel> getAll();
}
