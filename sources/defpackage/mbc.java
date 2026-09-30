package defpackage;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mbc {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        Integer numValueOf = Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE);
        map.put(Constants.NORMAL, numValueOf);
        map.put("bold", 700);
        ks0.r(1, map, "bolder", -1, "lighter");
        ks0.r(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", numValueOf);
        ks0.r(500, map, "500", 600, "600");
        ks0.x(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
