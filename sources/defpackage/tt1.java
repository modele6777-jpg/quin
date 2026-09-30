package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.LinkedHashMap;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 {
    public final vz9 a;
    public final vz9 b;
    public final LinkedHashMap c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;

    public tt1() {
        Boolean bool = Boolean.FALSE;
        this.a = q1c.f(bool);
        this.b = q1c.f(null);
        this.c = new LinkedHashMap();
        this.d = q1c.f(null);
        this.e = q1c.f(Float.valueOf(0.0f));
        this.f = q1c.f(bool);
        this.g = q1c.f(null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public static void c(tt1 tt1Var, TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, int i, boolean z, x16 x16Var, hkb hkbVar, Float f, boolean z2, int i2) {
        float fFloatValue;
        if ((i2 & 16) != 0) {
            x16Var = null;
        }
        if ((i2 & 32) != 0) {
            hkbVar = null;
        }
        if ((i2 & 64) != 0) {
            f = null;
        }
        boolean z3 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0;
        if ((i2 & 256) != 0) {
            z2 = false;
        }
        tt1Var.getClass();
        tarotCardType.getClass();
        tarotSkinIdentify.getClass();
        tt1Var.f.setValue(Boolean.valueOf(z3));
        ou1 ou1Var = (ou1) tt1Var.c.get(tarotCardType.getCardKey());
        if (z3) {
            hkbVar = null;
        } else if (hkbVar == null) {
            if (ou1Var != null) {
                hkbVar = (hkb) ou1Var.a.invoke();
            } else {
                hkbVar = null;
            }
        }
        tt1Var.d.setValue(hkbVar);
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            Float f2 = ou1Var != null ? ou1Var.b : null;
            fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
        }
        tt1Var.e.setValue(Float.valueOf(fFloatValue));
        tt1Var.b.setValue(new nu1(tarotCardType, tarotSkinIdentify, i, z, x16Var, z2));
        tt1Var.b(true);
    }

    public final String a() {
        return (String) this.g.getValue();
    }

    public final void b(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
