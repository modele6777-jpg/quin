package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dzf {
    public static final cy6 a = new cy6(new int[]{0, 2, 1}, 3);
    public static final cy6 b = new cy6(new int[]{0, 2, 1, 3, 4}, 5);
    public static final cy6 c = new cy6(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final cy6 d = cy6.c(2, 1, 6, 5, 3, 4);
    public static final cy6 e = cy6.c(2, 1, 7, 5, 6, 3, 4);

    public static su8 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = pqf.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                xo1.V("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(rda.d(new d0a(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    xo1.W("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new bzf(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new su8(arrayList);
    }
}
