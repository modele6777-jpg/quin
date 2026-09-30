package defpackage;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lbc {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new l9c(7, 0.694f));
        map.put("x-small", new l9c(7, 0.833f));
        map.put(Constants.SMALL, new l9c(7, 10.0f));
        map.put(Constants.MEDIUM, new l9c(7, 12.0f));
        map.put(Constants.LARGE, new l9c(7, 14.4f));
        map.put("x-large", new l9c(7, 17.3f));
        map.put("xx-large", new l9c(7, 20.7f));
        map.put("smaller", new l9c(9, 83.33f));
        map.put("larger", new l9c(9, 120.0f));
    }
}
