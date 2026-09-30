package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class se0 extends x60 {
    /* JADX WARN: Illegal instructions before constructor call */
    public se0(int i) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = leg.a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#" + ((String) leg.b.get(numValueOf2)) + ")";
        } else {
            str = "";
        }
        super(new Status(i, String.format(locale, "Asset Pack Download Error(%d): %s", numValueOf, str), null, null));
        if (i != 0) {
            return;
        }
        qc0.j("errorCode should not be 0.");
        throw null;
    }
}
