package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.DeviceTokenRequest;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl extends h36 implements l26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0196  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c9  */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ArrayList arrayList;
        boolean zB;
        boolean zB2;
        int size;
        int size2;
        int i;
        int i2 = this.a;
        a08 a08Var = null;
        wef wefVar = wef.a;
        switch (i2) {
            case 0:
                String str = (String) obj;
                str.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str);
                return wefVar;
            case 1:
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                int iIntValue = ((Number) obj2).intValue();
                tarotCardChoice.getClass();
                ((w10) this.receiver).l(tarotCardChoice, iIntValue);
                return wefVar;
            case 2:
                TarotCardChoice tarotCardChoice2 = (TarotCardChoice) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                tarotCardChoice2.getClass();
                r12 r12Var = (r12) this.receiver;
                r12Var.getClass();
                vz9 vz9Var = r12Var.v;
                if (((u12) vz9Var.getValue()) == null && !r12Var.e.contains(tarotCardChoice2.getCard()) && ((arrayList = r12Var.f) == null || s72.y0(iIntValue2, arrayList) == tarotCardChoice2.getCard())) {
                    vz9Var.setValue(new u12(tarotCardChoice2, iIntValue2));
                }
                return wefVar;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str2);
                return wefVar;
            case 4:
                ((my2) this.receiver).getClass();
                return my2.a((String) obj, (String) obj2);
            case 5:
                return bsa.o(((hs3) this.receiver).a, (String) obj, (xn2) obj2);
            case 6:
                xn2 xn2Var = (xn2) obj2;
                k2c k2cVar = (k2c) this.receiver;
                k2cVar.getClass();
                return k2cVar.c(xn2Var, new j2c(k2cVar, null), (String) obj);
            case 7:
                xn2 xn2Var2 = (xn2) obj2;
                k2c k2cVar2 = (k2c) this.receiver;
                k2cVar2.getClass();
                return k2cVar2.c(xn2Var2, new i2c(k2cVar2, null), (String) obj);
            case 8:
                String str3 = (String) obj;
                xn2 xn2Var3 = (xn2) obj2;
                k2c k2cVar3 = (k2c) this.receiver;
                k2cVar3.getClass();
                if (v4e.Q(str3)) {
                    return null;
                }
                return k2cVar3.f(str3, null, new v1c(k2cVar3, str3, null), xn2Var3);
            case 9:
                xn2 xn2Var4 = (xn2) obj2;
                k2c k2cVar4 = (k2c) this.receiver;
                k2cVar4.getClass();
                return k2cVar4.c(xn2Var4, new g2c(k2cVar4, null), (String) obj);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ((d56) this.receiver).o((DeviceTokenRequest) obj, (xn2) obj2);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((a26) this.receiver).d((j97) obj);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return ((r0) this.receiver).J0((DrawCardSaves) obj, (xn2) obj2);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                jo5 jo5Var = (jo5) obj;
                jo5 jo5Var2 = (jo5) obj2;
                mo5 mo5Var = (mo5) this.receiver;
                if (mo5Var.Y && (zB = ((ko5) jo5Var2).b()) != ((ko5) jo5Var).b()) {
                    if (zB) {
                        mmb mmbVar = new mmb();
                        if9.C(mo5Var, new jt3(18, mmbVar, mo5Var));
                        a08 a08Var2 = (a08) mmbVar.element;
                        if (a08Var2 != null) {
                            a08Var2.a();
                            a08Var = a08Var2;
                        }
                        mo5Var.G0 = a08Var;
                    } else {
                        a08 a08Var3 = mo5Var.G0;
                        if (a08Var3 != null) {
                            a08Var3.b();
                        }
                        mo5Var.G0 = null;
                    }
                }
                return wefVar;
            case 14:
                jo5 jo5Var3 = (jo5) obj;
                jo5 jo5Var4 = (jo5) obj2;
                vo5 vo5Var = (vo5) this.receiver;
                if (vo5Var.Y && (zB2 = ((ko5) jo5Var4).b()) != ((ko5) jo5Var3).b()) {
                    a26 a26Var = vo5Var.G0;
                    if (a26Var != null) {
                        a26Var.d(Boolean.valueOf(zB2));
                    }
                    eu4 eu4Var = wo5.Z;
                    if (zB2) {
                        ynb.V(vo5Var.Z0(), null, dw2.d, new uo5(vo5Var, null), 1);
                        mmb mmbVar2 = new mmb();
                        if9.C(vo5Var, new jt3(20, mmbVar2, vo5Var));
                        a08 a08Var4 = (a08) mmbVar2.element;
                        if (a08Var4 != null) {
                            a08Var4.a();
                        } else {
                            a08Var4 = null;
                        }
                        vo5Var.I0 = a08Var4;
                        yf9 yf9Var = vo5Var.J0;
                        if (yf9Var != null && yf9Var.h1().Y && vo5Var.Y) {
                            n3d.i(vo5Var, eu4Var);
                        }
                    } else {
                        a08 a08Var5 = vo5Var.I0;
                        if (a08Var5 != null) {
                            a08Var5.b();
                        }
                        vo5Var.I0 = null;
                        if (vo5Var.Y) {
                            n3d.i(vo5Var, eu4Var);
                        }
                    }
                    scc.k(vo5Var);
                    t69 t69Var = vo5Var.F0;
                    if (t69Var != null) {
                        rn5 rn5Var = vo5Var.H0;
                        if (zB2) {
                            if (rn5Var != null) {
                                vo5Var.o1(t69Var, new sn5(rn5Var));
                                vo5Var.H0 = null;
                            }
                            rn5 rn5Var2 = new rn5();
                            vo5Var.o1(t69Var, rn5Var2);
                            vo5Var.H0 = rn5Var2;
                        } else if (rn5Var != null) {
                            vo5Var.o1(t69Var, new sn5(rn5Var));
                            vo5Var.H0 = null;
                        }
                    }
                }
                return wefVar;
            case 15:
                String str4 = (String) obj;
                str4.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str4);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ((ypa) this.receiver).a((l26) obj, (xn2) obj2);
            case 17:
                ((my2) this.receiver).getClass();
                return my2.a((String) obj, (String) obj2);
            case 18:
                List list = (List) obj;
                xn2 xn2Var5 = (xn2) obj2;
                td6 td6Var = (td6) this.receiver;
                td6Var.getClass();
                fd6 fd6Var = fd6.c;
                fd6 fd6Var2 = fd6.b;
                fd6 fd6Var3 = fd6.a;
                fd6 fd6Var4 = fd6.d;
                if (list.size() != 1) {
                    size = list.size() - 1;
                    if (size >= 0) {
                        int i3 = -1;
                        while (true) {
                            int i4 = size - 1;
                            md6 md6Var = (md6) list.get(size);
                            if (!pa7.t(md6Var, fd6Var3) && !pa7.t(md6Var, fd6Var2) && !pa7.t(md6Var, fd6Var4) && !pa7.t(md6Var, fd6Var)) {
                                if ((md6Var instanceof kd6) && i3 < 0) {
                                    i3 = size;
                                }
                                if (i4 < 0) {
                                    size = i3;
                                } else {
                                    size = i4;
                                }
                            }
                        }
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        int size3 = list.size();
                        int i5 = -1;
                        int i6 = -1;
                        for (int i7 = 0; i7 < size3; i7++) {
                            md6 md6Var2 = (md6) list.get(i7);
                            if (md6Var2 instanceof id6) {
                                i5 = i7;
                            } else if (md6Var2 instanceof hd6) {
                                i6 = i7;
                            } else if (!(md6Var2 instanceof jd6)) {
                                if (i5 >= 0) {
                                    size = i5;
                                } else if (i6 >= 0) {
                                    size = i6;
                                } else if (td6Var.Y == null && td6Var.X.b()) {
                                    int size4 = list.size();
                                    size = 0;
                                    while (true) {
                                        if (size < size4) {
                                            md6 md6Var3 = (md6) list.get(size);
                                            if (!(md6Var3 instanceof gd6) && !(md6Var3 instanceof ld6)) {
                                                size++;
                                            }
                                        } else {
                                            size2 = list.size();
                                            size = -1;
                                            i = 0;
                                            while (i < size2) {
                                                int i8 = i;
                                                i++;
                                                size = i8;
                                            }
                                            if (size < 0) {
                                                size = 0;
                                            }
                                        }
                                    }
                                } else {
                                    size2 = list.size();
                                    size = -1;
                                    i = 0;
                                    while (i < size2 && (((md6) list.get(i)) instanceof jd6)) {
                                        int i9 = i;
                                        i++;
                                        size = i9;
                                    }
                                    if (size < 0) {
                                        size = 0;
                                    }
                                }
                            }
                        }
                        if (i5 >= 0) {
                            size = i5;
                        } else if (i6 >= 0) {
                            size = i6;
                        } else if (td6Var.Y == null) {
                            size2 = list.size();
                            size = -1;
                            i = 0;
                            while (i < size2) {
                                int i10 = i;
                                i++;
                                size = i10;
                            }
                            if (size < 0) {
                                size = 0;
                            }
                        } else {
                            size2 = list.size();
                            size = -1;
                            i = 0;
                            while (i < size2) {
                                int i11 = i;
                                i++;
                                size = i11;
                            }
                            if (size < 0) {
                                size = 0;
                            }
                        }
                    }
                } else {
                    size = 0;
                }
                md6 md6Var4 = (md6) list.get(size);
                if (pa7.t(md6Var4, fd6Var2)) {
                    list.remove(size);
                } else {
                    boolean zT = pa7.t(md6Var4, fd6Var);
                    bw2 bw2Var = bw2.a;
                    if (zT) {
                        Object objG = td6Var.G(list, xn2Var5);
                        if (objG == bw2Var) {
                            return objG;
                        }
                    } else if (pa7.t(md6Var4, fd6Var3)) {
                        vd6 vd6Var = td6Var.H0;
                        if (vd6Var != null) {
                            vd6Var.a();
                        }
                        td6Var.Y = null;
                        list.remove(size);
                        int i12 = 0;
                        while (i12 < size) {
                            md6 md6Var5 = (md6) list.get(i12);
                            if (!pa7.t(md6Var5, fd6Var4) && !pa7.t(md6Var5, fd6Var3) && !(md6Var5 instanceof jd6) && !(md6Var5 instanceof ld6)) {
                                if (md6Var5 instanceof gd6) {
                                    td6Var.b(((gd6) md6Var5).a);
                                } else {
                                    i12++;
                                }
                            }
                            list.remove(i12);
                            size--;
                        }
                    } else if (pa7.t(md6Var4, fd6Var4)) {
                        vd6 vd6Var2 = td6Var.H0;
                        if (vd6Var2 != null) {
                            vd6Var2.c();
                        }
                        td6Var.Y = null;
                        list.remove(size);
                        int i13 = 0;
                        while (i13 < size) {
                            md6 md6Var6 = (md6) list.get(i13);
                            if (pa7.t(md6Var6, fd6Var4) || (md6Var6 instanceof jd6)) {
                                list.remove(i13);
                                size--;
                            } else {
                                i13++;
                            }
                        }
                    } else if (md6Var4 instanceof kd6) {
                        Object objE = td6Var.E(list, size, (kd6) md6Var4, xn2Var5);
                        if (objE == bw2Var) {
                            return objE;
                        }
                    } else if (md6Var4 instanceof gd6) {
                        td6Var.u(list, size, (gd6) md6Var4, true);
                    } else if (md6Var4 instanceof ld6) {
                        td6Var.N(list, size, (ld6) md6Var4);
                    } else if (md6Var4 instanceof id6) {
                        id6 id6Var = (id6) md6Var4;
                        Map mapJ = td6Var.c;
                        td6Var.Z = id6Var.a;
                        Map map = id6Var.b;
                        td6Var.E0 = map;
                        if (!map.isEmpty()) {
                            fl8 fl8Var = new fl8();
                            fl8Var.putAll(map);
                            fl8Var.putAll(mapJ);
                            mapJ = fl8Var.j();
                        }
                        td6Var.F0 = mapJ;
                        list.remove(size);
                        int i14 = 0;
                        while (i14 < size) {
                            if (((md6) list.get(i14)) instanceof id6) {
                                list.remove(i14);
                                size--;
                            } else {
                                i14++;
                            }
                        }
                        td6Var.R();
                    } else {
                        if (md6Var4 instanceof hd6) {
                            throw null;
                        }
                        if (!(md6Var4 instanceof jd6)) {
                            ap.c();
                            return null;
                        }
                        td6Var.x(size, list, true);
                    }
                }
                return wefVar;
            case 19:
                String str5 = (String) obj;
                str5.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str5);
                return wefVar;
            case 20:
                String str6 = (String) obj;
                str6.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str6);
                return wefVar;
            case 21:
                String str7 = (String) obj;
                str7.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str7);
                return wefVar;
            case 22:
                nyc nycVar = (nyc) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                nycVar.getClass();
                ph7 ph7Var = (ph7) this.receiver;
                ph7Var.getClass();
                boolean z = !nycVar.j(iIntValue3) && nycVar.i(iIntValue3).c();
                ph7Var.b = z;
                return Boolean.valueOf(z);
            case 23:
                String str8 = (String) obj;
                str8.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str8);
                return wefVar;
            case 24:
                t6a t6aVar = (t6a) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                t6aVar.getClass();
                ((di9) this.receiver).getClass();
                di9.h(t6aVar, zBooleanValue);
                return wefVar;
            case 25:
                int iIntValue4 = ((Number) obj).intValue();
                bv7 bv7Var = (bv7) obj2;
                bv7Var.getClass();
                qt1 qt1Var = (qt1) this.receiver;
                qt1Var.getClass();
                qt1Var.c.put(Integer.valueOf(iIntValue4), z5c.g(bv7Var.N(0L), db6.Y0(bv7Var.l())));
                return wefVar;
            case 26:
                String str9 = (String) obj;
                str9.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str9);
                return wefVar;
            case 27:
                String str10 = (String) obj;
                str10.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str10);
                return wefVar;
            case 28:
                String str11 = (String) obj;
                str11.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str11);
                return wefVar;
            default:
                String str12 = (String) obj;
                str12.getClass();
                obj2.getClass();
                ((l1f) this.receiver).a(obj2, str12);
                return wefVar;
        }
    }
}
