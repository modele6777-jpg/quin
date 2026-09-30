package defpackage;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rl extends ul {
    public final String c;
    public final JSONObject d;
    public final Set e;

    public rl(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2, Set set) {
        super(str2, jSONObject);
        this.c = str;
        this.d = jSONObject2;
        this.e = set == null ? Collections.EMPTY_SET : set;
    }
}
