package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w04 {
    public static final QaResult a(String str, String str2) {
        if (str != null) {
            if (v4e.Q(str)) {
                str = null;
            }
            if (str != null) {
                List list = u04.b;
                if (!list.contains(str)) {
                    return new QaResult.Err("unknown dest '" + str + "'; one of " + list, "unknown_dest");
                }
                if (qd0.I0(new String[]{"share-long-sample", "share-long-stress", "message-selection"}).contains(str)) {
                    return new QaResult.Err("QA fixtures require a debug build", "disabled");
                }
                m65 m65Var = u04.a;
                if (m65Var == null) {
                    return new QaResult.Err("nav unavailable — foreground the AUT on a normal screen first", "no_nav");
                }
                new Handler(Looper.getMainLooper()).post(new c0(m65Var, str, str2, 13));
                return new QaResult.Ok(new ti7(ib8.q("dest", oh7.c(str))));
            }
        }
        return new QaResult.Err("missing 'dest'; one of " + u04.b, "invalid_params");
    }
}
