package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh1 implements zk9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sh1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zk9
    public final void a(Object obj) {
        boolean z;
        int i = 2;
        switch (this.a) {
            case 0:
                uh1 uh1Var = (uh1) this.b;
                String str = (String) this.c;
                ho0 ho0Var = (ho0) obj;
                if (!uh1Var.l.get()) {
                    b21.q("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                    return;
                }
                if (ho0Var.b != null) {
                    StringBuilder sbP = tec.p("Camera ", str, " state changed to ");
                    sbP.append(ks0.A(ho0Var.a));
                    sbP.append(" with error: ");
                    io0 io0Var = ho0Var.b;
                    sbP.append(io0Var != null ? Integer.valueOf(io0Var.a) : null);
                    sbP.append(". Triggering refresh.");
                    b21.W("CameraPresencePrvdr", sbP.toString());
                    uh1Var.a.execute(new qh1(uh1Var, i));
                    return;
                }
                return;
            default:
                ys3 ys3Var = (ys3) this.b;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.c;
                wag wagVar = (wag) obj;
                if (wagVar != null) {
                    ys3Var.d().e("Work status changed: " + wagVar.b + ", progress: " + wagVar.e);
                    int iOrdinal = wagVar.b.ordinal();
                    float f = 0.0f;
                    if (iOrdinal == 1) {
                        bb3 bb3Var = wagVar.e;
                        bb3Var.getClass();
                        Object objValueOf = Float.valueOf(0.0f);
                        Object obj2 = bb3Var.a.get("progress");
                        if (obj2 instanceof Float) {
                            objValueOf = obj2;
                        }
                        float fFloatValue = ((Number) objValueOf).floatValue();
                        ys3Var.d().e("Work running for skin: " + tarotSkinIdentify.name() + ", progress: " + fFloatValue);
                        ys3Var.f(tarotSkinIdentify, fFloatValue);
                        return;
                    }
                    int i2 = 6;
                    if (iOrdinal == 2) {
                        ys3Var.d().e("Work succeeded for skin: " + tarotSkinIdentify.name());
                        ys3Var.d().e("Skin " + tarotSkinIdentify.name() + " download completed");
                        synchronized (ys3Var.e) {
                            try {
                                Collection collectionValues = ys3Var.e.values();
                                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                                    z = true;
                                } else {
                                    Iterator it = collectionValues.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z = true;
                                        } else if (((Set) it.next()).contains(tarotSkinIdentify)) {
                                            z = false;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        ys3Var.g(tarotSkinIdentify, new hmd(gmd.e, 1.0f, 4));
                        s0e s0eVar = ys3Var.w;
                        s0eVar.n(null, Integer.valueOf(((Number) s0eVar.getValue()).intValue() + 1));
                        if (z) {
                            ys3Var.d.post(new ni(i2));
                        }
                        ys3Var.b(tarotSkinIdentify);
                        return;
                    }
                    int i3 = 5;
                    if (iOrdinal != 3) {
                        if (iOrdinal == 5) {
                            ys3Var.g(tarotSkinIdentify, new hmd(gmd.b, f, i2));
                            ys3Var.b(tarotSkinIdentify);
                            return;
                        }
                        ys3Var.d().e("Work state: " + wagVar.b + " for skin: " + tarotSkinIdentify.name());
                        return;
                    }
                    String strD = wagVar.d.d("error");
                    if (strD == null) {
                        strD = "Unknown error";
                    }
                    ys3Var.d().b("Work failed for skin: " + tarotSkinIdentify.name() + ", error: " + strD);
                    ys3Var.d().g("Skin " + tarotSkinIdentify.name() + " download failed: " + strD);
                    ys3Var.g(tarotSkinIdentify, new hmd(gmd.d, 0.0f, strD));
                    ys3Var.d.post(new ni(i3));
                    ys3Var.b(tarotSkinIdentify);
                    return;
                }
                return;
        }
    }
}
