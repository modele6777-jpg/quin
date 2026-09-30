package defpackage;

import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g01 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g01(dhc dhcVar, int i, cea ceaVar) {
        this.a = 4;
        this.d = dhcVar;
        this.b = i;
        this.c = ceaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        kg2 kg2Var;
        long[] jArr;
        kg2 kg2Var2;
        long[] jArr2;
        int i;
        int i2 = this.a;
        int i3 = 0;
        wef wefVar = wef.a;
        int i4 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                bea beaVar = (bea) obj;
                beaVar.getClass();
                bea.j(beaVar, (cea) obj3, 0L);
                beaVar.g((cea) obj2, i4, 0, 0.0f);
                break;
            case 1:
                Map map = (Map) obj3;
                ghc ghcVar = (ghc) obj2;
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                map.put(Integer.valueOf(i4), new ol4(vd0.S(bv7Var).M(bv7Var, true), ghcVar != null ? ghcVar.a.j() : 0));
                break;
            case 2:
                l26 l26Var = (l26) obj2;
                ((Float) obj).getClass();
                TarotCardChoice tarotCardChoice = (TarotCardChoice) ((e89) obj3).getValue();
                if (tarotCardChoice != null) {
                    l26Var.z(tarotCardChoice, Integer.valueOf(i4));
                }
                break;
            case 3:
                ojb ojbVar = (ojb) obj3;
                e79 e79Var = (e79) obj2;
                kg2 kg2Var3 = (kg2) obj;
                if (ojbVar.e == i4 && pa7.t(e79Var, ojbVar.f) && (kg2Var3 instanceof rg2)) {
                    long[] jArr3 = e79Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr3[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = e79Var.b[i9];
                                        boolean z = e79Var.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            rg2 rg2Var = (rg2) kg2Var3;
                                            kg2Var2 = kg2Var3;
                                            w79 w79Var = rg2Var.g;
                                            rfc.o(w79Var, obj4, ojbVar);
                                            jArr2 = jArr3;
                                            if (obj4 instanceof mx3) {
                                                mx3 mx3Var = (mx3) obj4;
                                                if (!w79Var.c(mx3Var)) {
                                                    rfc.p(rg2Var.x, mx3Var);
                                                }
                                                w79 w79Var2 = ojbVar.g;
                                                if (w79Var2 != null) {
                                                    w79Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            kg2Var2 = kg2Var3;
                                            jArr2 = jArr3;
                                            i = i6;
                                        }
                                        if (z) {
                                            e79Var.f(i9);
                                        }
                                    } else {
                                        kg2Var2 = kg2Var3;
                                        jArr2 = jArr3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    kg2Var3 = kg2Var2;
                                    jArr3 = jArr2;
                                }
                                kg2Var = kg2Var3;
                                jArr = jArr3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                kg2Var = kg2Var3;
                                jArr = jArr3;
                            }
                            if (i5 != length) {
                                i5++;
                                kg2Var3 = kg2Var;
                                jArr3 = jArr;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            case 4:
                dhc dhcVar = (dhc) obj2;
                cea ceaVar = (cea) obj3;
                bea beaVar2 = (bea) obj;
                int iJ = dhcVar.Z.a.j();
                if (iJ < 0) {
                    iJ = 0;
                }
                if (iJ <= i4) {
                    i4 = iJ;
                }
                int i10 = -i4;
                boolean z2 = dhcVar.E0;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                beaVar2.a = true;
                bea.n(beaVar2, ceaVar, i11, i10);
                beaVar2.a = false;
                break;
            case 5:
                d83 d83Var = (d83) obj3;
                e83 e83Var = (e83) obj2;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                if (d83Var != d83.c) {
                    l1fVar.a("set_notification_reminder", "btn");
                    l1fVar.a("open_notification", "pathway");
                    l1fVar.a(Integer.valueOf(i4), "touchpoint_id");
                    boolean z3 = e83Var.b;
                    l1fVar.a((e83Var.a && z3) ? "both" : z3 ? "tomorrow" : "today", "selected_reminder_type");
                } else {
                    l1fVar.a("enable_tomorrow_reminder", "btn");
                    l1fVar.a("tomorrow_fortune_reminder_guide", "pathway");
                }
                break;
            case 6:
                xtf xtfVar = (xtf) obj2;
                cea ceaVar2 = (cea) obj3;
                bea beaVar3 = (bea) obj;
                int i12 = xtfVar.b;
                pqe pqeVar = xtfVar.a;
                w2f w2fVar = xtfVar.c;
                tte tteVar = (tte) xtfVar.d.invoke();
                pqeVar.a(ks9.a, tgc.g(beaVar3, i12, w2fVar, tteVar != null ? tteVar.a : null, false, ceaVar2.a), i4, ceaVar2.b);
                beaVar3.k(ceaVar2, 0, Math.round(-pqeVar.a.j()), 0.0f);
                break;
            default:
                ((l26) obj3).z(((List) obj2).get(((Integer) obj).intValue()), Integer.valueOf(i4));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ g01(xtf xtfVar, cea ceaVar, int i) {
        this.a = 6;
        this.d = xtfVar;
        this.c = ceaVar;
        this.b = i;
    }

    public /* synthetic */ g01(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ g01(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
