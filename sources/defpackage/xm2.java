package defpackage;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xm2 {
    public static final w84 a = w84.b1("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:434:0x075a A[LOOP:1: B:432:0x0754->B:434:0x075a, LOOP_END] */
    public static wm2 a(kj7 kj7Var, uh8 uh8Var) throws uh7, EOFException {
        String strNextString;
        wm2 x02Var;
        wm2 c5dVar;
        wm2 e5dVar;
        wm2 cd6Var;
        int i;
        kj7Var.beginObject();
        int iNextInt = 2;
        while (true) {
            if (!kj7Var.hasNext()) {
                strNextString = null;
                break;
            }
            int iX = kj7Var.x(a);
            if (iX == 0) {
                strNextString = kj7Var.nextString();
                break;
            }
            if (iX != 1) {
                kj7Var.E();
                kj7Var.skipValue();
            } else {
                iNextInt = kj7Var.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        boolean zH = false;
        boolean zH2 = false;
        int i2 = 0;
        int i3 = 3;
        switch (strNextString) {
            case "el":
                w84 w84Var = z02.a;
                boolean z = iNextInt == 3;
                boolean zH3 = false;
                String strNextString2 = null;
                sx sxVarB = null;
                kx kxVarT0 = null;
                while (kj7Var.hasNext()) {
                    int iX2 = kj7Var.x(z02.a);
                    if (iX2 == 0) {
                        strNextString2 = kj7Var.nextString();
                    } else if (iX2 == 1) {
                        sxVarB = nx.b(kj7Var, uh8Var);
                    } else if (iX2 == 2) {
                        kxVarT0 = kj0.t0(kj7Var, uh8Var);
                    } else if (iX2 == 3) {
                        zH3 = kj7Var.h();
                    } else if (iX2 != 4) {
                        kj7Var.E();
                        kj7Var.skipValue();
                    } else {
                        z = kj7Var.nextInt() == 3;
                    }
                }
                x02Var = new x02(strNextString2, sxVarB, kxVarT0, z, zH3);
                c5dVar = x02Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "fl":
                w84 w84Var2 = d5d.a;
                int iNextInt2 = 1;
                boolean zH4 = false;
                boolean zH5 = false;
                kx kxVar = null;
                String strNextString3 = null;
                kx kxVarP0 = null;
                while (kj7Var.hasNext()) {
                    int iX3 = kj7Var.x(d5d.a);
                    if (iX3 == 0) {
                        strNextString3 = kj7Var.nextString();
                    } else if (iX3 == 1) {
                        kxVarP0 = kj0.p0(kj7Var, uh8Var);
                    } else if (iX3 == 2) {
                        kxVar = kj0.s0(kj7Var, uh8Var);
                    } else if (iX3 == 3) {
                        zH4 = kj7Var.h();
                    } else if (iX3 == 4) {
                        iNextInt2 = kj7Var.nextInt();
                    } else if (iX3 != 5) {
                        kj7Var.E();
                        kj7Var.skipValue();
                    } else {
                        zH5 = kj7Var.h();
                    }
                }
                if (kxVar == null) {
                    kxVar = new kx(Collections.singletonList(new bp7(100)), 2);
                }
                c5dVar = new c5d(strNextString3, zH4, iNextInt2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, kxVarP0, kxVar, zH5);
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "gf":
                w84 w84Var3 = bd6.a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i4 = 0;
                boolean zH6 = false;
                kx kxVar2 = null;
                String strNextString4 = null;
                kx kxVarR0 = null;
                kx kxVarT1 = null;
                kx kxVarT2 = null;
                while (kj7Var.hasNext()) {
                    switch (kj7Var.x(bd6.a)) {
                        case 0:
                            strNextString4 = kj7Var.nextString();
                            break;
                        case 1:
                            kj7Var.beginObject();
                            int iNextInt3 = -1;
                            while (kj7Var.hasNext()) {
                                int iX4 = kj7Var.x(bd6.b);
                                if (iX4 == 0) {
                                    iNextInt3 = kj7Var.nextInt();
                                } else if (iX4 != 1) {
                                    kj7Var.E();
                                    kj7Var.skipValue();
                                } else {
                                    kxVarR0 = kj0.r0(kj7Var, uh8Var, iNextInt3);
                                }
                            }
                            kj7Var.endObject();
                            break;
                        case 2:
                            kxVar2 = kj0.s0(kj7Var, uh8Var);
                            break;
                        case 3:
                            i4 = kj7Var.nextInt() != 1 ? 2 : 1;
                            break;
                        case 4:
                            kxVarT1 = kj0.t0(kj7Var, uh8Var);
                            break;
                        case 5:
                            kxVarT2 = kj0.t0(kj7Var, uh8Var);
                            break;
                        case 6:
                            fillType = kj7Var.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zH6 = kj7Var.h();
                            break;
                        default:
                            kj7Var.E();
                            kj7Var.skipValue();
                            break;
                    }
                }
                if (kxVar2 == null) {
                    kxVar2 = new kx(Collections.singletonList(new bp7(100)), 2);
                }
                c5dVar = new zc6(strNextString4, i4, fillType, kxVarR0, kxVar2, kxVarT1, kxVarT2, zH6);
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "gr":
                w84 w84Var4 = f5d.a;
                ArrayList arrayList = new ArrayList();
                String strNextString5 = null;
                while (kj7Var.hasNext()) {
                    int iX5 = kj7Var.x(f5d.a);
                    if (iX5 == 0) {
                        strNextString5 = kj7Var.nextString();
                    } else if (iX5 == 1) {
                        zH = kj7Var.h();
                    } else if (iX5 != 2) {
                        kj7Var.skipValue();
                    } else {
                        kj7Var.beginArray();
                        while (kj7Var.hasNext()) {
                            wm2 wm2VarA = a(kj7Var, uh8Var);
                            if (wm2VarA != null) {
                                arrayList.add(wm2VarA);
                            }
                        }
                        kj7Var.endArray();
                    }
                }
                e5dVar = new e5d(strNextString5, arrayList, zH);
                c5dVar = e5dVar;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "gs":
                w84 w84Var5 = ed6.a;
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                boolean zH7 = false;
                kx kxVar3 = null;
                String strNextString6 = null;
                kx kxVarR1 = null;
                kx kxVarT3 = null;
                kx kxVarT4 = null;
                lx lxVarQ0 = null;
                lx lxVar = null;
                float fNextDouble = 0.0f;
                while (kj7Var.hasNext()) {
                    switch (kj7Var.x(ed6.a)) {
                        case 0:
                            strNextString6 = kj7Var.nextString();
                            break;
                        case 1:
                            kj7Var.beginObject();
                            int iNextInt4 = -1;
                            while (kj7Var.hasNext()) {
                                int iX6 = kj7Var.x(ed6.b);
                                if (iX6 == 0) {
                                    iNextInt4 = kj7Var.nextInt();
                                } else if (iX6 != 1) {
                                    kj7Var.E();
                                    kj7Var.skipValue();
                                } else {
                                    kxVarR1 = kj0.r0(kj7Var, uh8Var, iNextInt4);
                                }
                            }
                            kj7Var.endObject();
                            break;
                        case 2:
                            kxVar3 = kj0.s0(kj7Var, uh8Var);
                            break;
                        case 3:
                            i5 = kj7Var.nextInt() != 1 ? 2 : 1;
                            break;
                        case 4:
                            kxVarT3 = kj0.t0(kj7Var, uh8Var);
                            break;
                        case 5:
                            kxVarT4 = kj0.t0(kj7Var, uh8Var);
                            break;
                        case 6:
                            lxVarQ0 = kj0.q0(kj7Var, uh8Var, true);
                            break;
                        case 7:
                            i6 = kv2.C(3)[kj7Var.nextInt() - 1];
                            break;
                        case 8:
                            i7 = kv2.C(3)[kj7Var.nextInt() - 1];
                            break;
                        case 9:
                            fNextDouble = (float) kj7Var.nextDouble();
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            zH7 = kj7Var.h();
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            kj7Var.beginArray();
                            while (kj7Var.hasNext()) {
                                kj7Var.beginObject();
                                String strNextString7 = null;
                                lx lxVarQ1 = null;
                                while (kj7Var.hasNext()) {
                                    int iX7 = kj7Var.x(ed6.c);
                                    if (iX7 == 0) {
                                        strNextString7 = kj7Var.nextString();
                                    } else if (iX7 != 1) {
                                        kj7Var.E();
                                        kj7Var.skipValue();
                                    } else {
                                        lxVarQ1 = kj0.q0(kj7Var, uh8Var, true);
                                    }
                                }
                                kj7Var.endObject();
                                if (strNextString7.equals("o")) {
                                    lxVar = lxVarQ1;
                                } else if (strNextString7.equals("d") || strNextString7.equals("g")) {
                                    uh8Var.o = true;
                                    arrayList2.add(lxVarQ1);
                                }
                            }
                            kj7Var.endArray();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((lx) arrayList2.get(0));
                            }
                            break;
                        default:
                            kj7Var.E();
                            kj7Var.skipValue();
                            break;
                    }
                }
                if (kxVar3 == null) {
                    kxVar3 = new kx(Collections.singletonList(new bp7(100)), 2);
                }
                cd6Var = new cd6(strNextString6, i5, kxVarR1, kxVar3, kxVarT3, kxVarT4, lxVarQ0, i6, i7, fNextDouble, arrayList2, lxVar, zH7);
                c5dVar = cd6Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "mm":
                w84 w84Var6 = ss8.a;
                boolean zH8 = false;
                String strNextString8 = null;
                while (kj7Var.hasNext()) {
                    int iX8 = kj7Var.x(ss8.a);
                    if (iX8 == 0) {
                        strNextString8 = kj7Var.nextString();
                    } else if (iX8 == 1) {
                        int iNextInt5 = kj7Var.nextInt();
                        if (iNextInt5 != 1) {
                            if (iNextInt5 == 2) {
                                i2 = 2;
                            } else if (iNextInt5 == 3) {
                                i2 = 3;
                            } else if (iNextInt5 == 4) {
                                i2 = 4;
                            } else if (iNextInt5 == 5) {
                                i2 = 5;
                            }
                        }
                        i2 = 1;
                    } else if (iX8 != 2) {
                        kj7Var.E();
                        kj7Var.skipValue();
                    } else {
                        zH8 = kj7Var.h();
                    }
                }
                qs8 qs8Var = new qs8(i2, strNextString8, zH8);
                uh8Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                c5dVar = qs8Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "rc":
                w84 w84Var7 = mkb.a;
                boolean zH9 = false;
                String strNextString9 = null;
                sx sxVarB2 = null;
                kx kxVarT5 = null;
                lx lxVarQ2 = null;
                while (kj7Var.hasNext()) {
                    int iX9 = kj7Var.x(mkb.a);
                    if (iX9 == 0) {
                        strNextString9 = kj7Var.nextString();
                    } else if (iX9 == 1) {
                        sxVarB2 = nx.b(kj7Var, uh8Var);
                    } else if (iX9 == 2) {
                        kxVarT5 = kj0.t0(kj7Var, uh8Var);
                    } else if (iX9 == 3) {
                        lxVarQ2 = kj0.q0(kj7Var, uh8Var, true);
                    } else if (iX9 != 4) {
                        kj7Var.skipValue();
                    } else {
                        zH9 = kj7Var.h();
                    }
                }
                cd6Var = new lkb(strNextString9, sxVarB2, kxVarT5, lxVarQ2, zH9);
                c5dVar = cd6Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "rd":
                w84 w84Var8 = d7c.a;
                String strNextString10 = null;
                lx lxVarQ3 = null;
                while (kj7Var.hasNext()) {
                    int iX10 = kj7Var.x(d7c.a);
                    if (iX10 == 0) {
                        strNextString10 = kj7Var.nextString();
                    } else if (iX10 == 1) {
                        lxVarQ3 = kj0.q0(kj7Var, uh8Var, true);
                    } else if (iX10 != 2) {
                        kj7Var.skipValue();
                    } else {
                        zH2 = kj7Var.h();
                    }
                }
                c5dVar = zH2 ? null : new b7c(strNextString10, lxVarQ3);
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "rp":
                w84 w84Var9 = urb.a;
                boolean zH10 = false;
                String strNextString11 = null;
                lx lxVarQ4 = null;
                lx lxVarQ5 = null;
                qx qxVarC = null;
                while (kj7Var.hasNext()) {
                    int iX11 = kj7Var.x(urb.a);
                    if (iX11 == 0) {
                        strNextString11 = kj7Var.nextString();
                    } else if (iX11 == 1) {
                        lxVarQ4 = kj0.q0(kj7Var, uh8Var, false);
                    } else if (iX11 == 2) {
                        lxVarQ5 = kj0.q0(kj7Var, uh8Var, false);
                    } else if (iX11 == 3) {
                        qxVarC = rx.c(kj7Var, uh8Var);
                    } else if (iX11 != 4) {
                        kj7Var.skipValue();
                    } else {
                        zH10 = kj7Var.h();
                    }
                }
                cd6Var = new lkb(strNextString11, lxVarQ4, lxVarQ5, qxVarC, zH10);
                c5dVar = cd6Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "sh":
                w84 w84Var10 = l5d.a;
                int iNextInt6 = 0;
                boolean zH11 = false;
                kx kxVar4 = null;
                String strNextString12 = null;
                while (kj7Var.hasNext()) {
                    int iX12 = kj7Var.x(l5d.a);
                    if (iX12 == 0) {
                        strNextString12 = kj7Var.nextString();
                    } else if (iX12 == 1) {
                        iNextInt6 = kj7Var.nextInt();
                    } else if (iX12 == 2) {
                        kxVar4 = new kx(ep7.a(kj7Var, uh8Var, xqf.c(), a5d.a, false), 5);
                    } else if (iX12 != 3) {
                        kj7Var.skipValue();
                    } else {
                        zH11 = kj7Var.h();
                    }
                }
                e5dVar = new k5d(strNextString12, iNextInt6, kxVar4, zH11);
                c5dVar = e5dVar;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "sr":
                w84 w84Var11 = eja.a;
                boolean z2 = iNextInt == 3;
                boolean zH12 = false;
                String strNextString13 = null;
                cja cjaVarA = null;
                lx lxVarQ6 = null;
                sx sxVarB3 = null;
                lx lxVarQ7 = null;
                lx lxVarQ8 = null;
                lx lxVarQ9 = null;
                lx lxVarQ10 = null;
                lx lxVarQ11 = null;
                while (kj7Var.hasNext()) {
                    switch (kj7Var.x(eja.a)) {
                        case 0:
                            strNextString13 = kj7Var.nextString();
                            break;
                        case 1:
                            cjaVarA = cja.a(kj7Var.nextInt());
                            break;
                        case 2:
                            lxVarQ6 = kj0.q0(kj7Var, uh8Var, false);
                            break;
                        case 3:
                            sxVarB3 = nx.b(kj7Var, uh8Var);
                            break;
                        case 4:
                            lxVarQ7 = kj0.q0(kj7Var, uh8Var, false);
                            break;
                        case 5:
                            lxVarQ9 = kj0.q0(kj7Var, uh8Var, true);
                            break;
                        case 6:
                            lxVarQ11 = kj0.q0(kj7Var, uh8Var, false);
                            break;
                        case 7:
                            lxVarQ8 = kj0.q0(kj7Var, uh8Var, true);
                            break;
                        case 8:
                            lxVarQ10 = kj0.q0(kj7Var, uh8Var, false);
                            break;
                        case 9:
                            zH12 = kj7Var.h();
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            z2 = kj7Var.nextInt() == 3;
                            break;
                        default:
                            kj7Var.E();
                            kj7Var.skipValue();
                            break;
                    }
                }
                cd6Var = new dja(strNextString13, cjaVarA, lxVarQ6, sxVarB3, lxVarQ7, lxVarQ8, lxVarQ9, lxVarQ10, lxVarQ11, zH12, z2);
                c5dVar = cd6Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "st":
                w84 w84Var12 = n5d.a;
                ArrayList arrayList3 = new ArrayList();
                int i8 = 0;
                int i9 = 0;
                boolean zH13 = false;
                kx kxVar5 = null;
                String strNextString14 = null;
                lx lxVar2 = null;
                kx kxVarP1 = null;
                lx lxVarQ12 = null;
                float fNextDouble2 = 0.0f;
                while (kj7Var.hasNext()) {
                    switch (kj7Var.x(n5d.a)) {
                        case 0:
                            strNextString14 = kj7Var.nextString();
                            continue;
                        case 1:
                            kxVarP1 = kj0.p0(kj7Var, uh8Var);
                            continue;
                        case 2:
                            lxVarQ12 = kj0.q0(kj7Var, uh8Var, true);
                            continue;
                        case 3:
                            kxVar5 = kj0.s0(kj7Var, uh8Var);
                            continue;
                        case 4:
                            i8 = kv2.C(i3)[kj7Var.nextInt() - 1];
                            continue;
                        case 5:
                            i9 = kv2.C(i3)[kj7Var.nextInt() - 1];
                            continue;
                        case 6:
                            i = i3;
                            fNextDouble2 = (float) kj7Var.nextDouble();
                            break;
                        case 7:
                            zH13 = kj7Var.h();
                            continue;
                        case 8:
                            kj7Var.beginArray();
                            while (kj7Var.hasNext()) {
                                kj7Var.beginObject();
                                lx lxVarQ13 = null;
                                String strNextString15 = null;
                                while (kj7Var.hasNext()) {
                                    int i10 = i3;
                                    int iX13 = kj7Var.x(n5d.b);
                                    if (iX13 == 0) {
                                        strNextString15 = kj7Var.nextString();
                                    } else if (iX13 != 1) {
                                        kj7Var.E();
                                        kj7Var.skipValue();
                                    } else {
                                        lxVarQ13 = kj0.q0(kj7Var, uh8Var, true);
                                    }
                                    i3 = i10;
                                }
                                int i11 = i3;
                                kj7Var.endObject();
                                strNextString15.getClass();
                                switch (strNextString15) {
                                    case "d":
                                    case "g":
                                        uh8Var.o = true;
                                        arrayList3.add(lxVarQ13);
                                        break;
                                    case "o":
                                        lxVar2 = lxVarQ13;
                                        break;
                                }
                                i3 = i11;
                            }
                            i = i3;
                            kj7Var.endArray();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((lx) arrayList3.get(0));
                            }
                            break;
                        default:
                            kj7Var.skipValue();
                            continue;
                    }
                    i3 = i;
                }
                if (kxVar5 == null) {
                    kxVar5 = new kx(Collections.singletonList(new bp7(100)), 2);
                }
                c5dVar = new m5d(strNextString14, lxVar2, arrayList3, kxVarP1, kxVar5, lxVarQ12, i8 == 0 ? 1 : i8, i9 == 0 ? 1 : i9, fNextDouble2, zH13);
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "tm":
                w84 w84Var13 = r5d.a;
                int i12 = 0;
                boolean zH14 = false;
                String strNextString16 = null;
                lx lxVarQ14 = null;
                lx lxVarQ15 = null;
                lx lxVarQ16 = null;
                while (kj7Var.hasNext()) {
                    int iX14 = kj7Var.x(r5d.a);
                    if (iX14 == 0) {
                        lxVarQ14 = kj0.q0(kj7Var, uh8Var, false);
                    } else if (iX14 == 1) {
                        lxVarQ15 = kj0.q0(kj7Var, uh8Var, false);
                    } else if (iX14 == 2) {
                        lxVarQ16 = kj0.q0(kj7Var, uh8Var, false);
                    } else if (iX14 == 3) {
                        strNextString16 = kj7Var.nextString();
                    } else if (iX14 == 4) {
                        int iNextInt7 = kj7Var.nextInt();
                        if (iNextInt7 == 1) {
                            i12 = 1;
                        } else {
                            if (iNextInt7 != 2) {
                                qc0.j(tec.e(iNextInt7, "Unknown trim path type "));
                                return null;
                            }
                            i12 = 2;
                        }
                    } else if (iX14 != 5) {
                        kj7Var.skipValue();
                    } else {
                        zH14 = kj7Var.h();
                    }
                }
                x02Var = new q5d(strNextString16, i12, lxVarQ14, lxVarQ15, lxVarQ16, zH14);
                c5dVar = x02Var;
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            case "tr":
                c5dVar = rx.c(kj7Var, uh8Var);
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
            default:
                gf8.b("Unknown shape type ".concat(strNextString));
                while (kj7Var.hasNext()) {
                    kj7Var.skipValue();
                }
                kj7Var.endObject();
                return c5dVar;
        }
    }
}
