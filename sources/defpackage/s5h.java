package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s5h implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s5h(int i) {
        this.a = i;
    }

    public static void a(n76 n76Var, Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        int i2 = n76Var.a;
        hcc.z(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = n76Var.b;
        hcc.z(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = n76Var.c;
        hcc.z(parcel, 3, 4);
        parcel.writeInt(i4);
        hcc.v(parcel, 4, n76Var.d);
        hcc.s(parcel, 5, n76Var.e);
        hcc.x(parcel, 6, n76Var.f, i);
        hcc.p(parcel, 7, n76Var.g);
        hcc.u(parcel, 8, n76Var.v, i);
        hcc.x(parcel, 10, n76Var.w, i);
        hcc.x(parcel, 11, n76Var.x, i);
        boolean z = n76Var.y;
        hcc.z(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = n76Var.z;
        hcc.z(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = n76Var.X;
        hcc.z(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        hcc.v(parcel, 15, n76Var.Y);
        hcc.C(parcel, iB);
    }

    public static void b(mch mchVar, Parcel parcel) {
        int i = mchVar.a;
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(i);
        hcc.v(parcel, 2, mchVar.b);
        long j = mchVar.c;
        hcc.z(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = mchVar.d;
        if (l != null) {
            hcc.z(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        hcc.v(parcel, 6, mchVar.e);
        hcc.v(parcel, 7, mchVar.f);
        Double d = mchVar.g;
        if (d != null) {
            hcc.z(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        hcc.C(parcel, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jZ = 0;
        boolean zW = false;
        int iY = 0;
        int iY2 = 0;
        int iY3 = 0;
        int iY4 = 0;
        String strK = null;
        ArrayList arrayListN = null;
        String strK2 = null;
        String strK3 = null;
        Bundle bundleF = null;
        ArrayList arrayListN2 = null;
        switch (this.a) {
            case 0:
                int iG = gcc.G(parcel);
                String strK4 = null;
                byte[] bArrG = null;
                byte[][] bArrH = null;
                byte[][] bArrH2 = null;
                byte[][] bArrH3 = null;
                byte[][] bArrH4 = null;
                int[] iArrI = null;
                byte[][] bArrH5 = null;
                int[] iArrI2 = null;
                byte[][] bArrH6 = null;
                while (parcel.dataPosition() < iG) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strK4 = gcc.k(parcel, i);
                            break;
                        case 3:
                            bArrG = gcc.g(parcel, i);
                            break;
                        case 4:
                            bArrH = gcc.h(parcel, i);
                            break;
                        case 5:
                            bArrH2 = gcc.h(parcel, i);
                            break;
                        case 6:
                            bArrH3 = gcc.h(parcel, i);
                            break;
                        case 7:
                            bArrH4 = gcc.h(parcel, i);
                            break;
                        case '\b':
                            iArrI = gcc.i(parcel, i);
                            break;
                        case '\t':
                            bArrH5 = gcc.h(parcel, i);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            iArrI2 = gcc.i(parcel, i);
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            bArrH6 = gcc.h(parcel, i);
                            break;
                        default:
                            gcc.B(parcel, i);
                            break;
                    }
                }
                gcc.o(parcel, iG);
                return new r5h(strK4, bArrG, bArrH, bArrH2, bArrH3, bArrH4, iArrI, bArrH5, iArrI2, bArrH6);
            case 1:
                int iG2 = gcc.G(parcel);
                long jZ2 = 0;
                double d = 0.0d;
                boolean zW2 = false;
                int iY5 = 0;
                int iY6 = 0;
                int iY7 = 0;
                String strK5 = null;
                String strK6 = null;
                byte[] bArrG2 = null;
                while (parcel.dataPosition() < iG2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strK5 = gcc.k(parcel, i2);
                            break;
                        case 3:
                            jZ2 = gcc.z(parcel, i2);
                            break;
                        case 4:
                            zW2 = gcc.w(parcel, i2);
                            break;
                        case 5:
                            gcc.I(parcel, i2, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strK6 = gcc.k(parcel, i2);
                            break;
                        case 7:
                            bArrG2 = gcc.g(parcel, i2);
                            break;
                        case '\b':
                            iY5 = gcc.y(parcel, i2);
                            break;
                        case '\t':
                            iY6 = gcc.y(parcel, i2);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            iY7 = gcc.y(parcel, i2);
                            break;
                        default:
                            gcc.B(parcel, i2);
                            break;
                    }
                }
                gcc.o(parcel, iG2);
                return new u5h(strK5, jZ2, zW2, d, strK6, bArrG2, iY5, iY6, iY7);
            case 2:
                int iG3 = gcc.G(parcel);
                String strK7 = null;
                u5h u5hVar = null;
                while (parcel.dataPosition() < iG3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 2) {
                        strK = gcc.k(parcel, i3);
                    } else if (c == 3) {
                        strK7 = gcc.k(parcel, i3);
                    } else if (c == 4) {
                        u5hVar = (u5h) gcc.j(parcel, i3, u5h.CREATOR);
                    } else if (c != 5) {
                        gcc.B(parcel, i3);
                    } else {
                        zW = gcc.w(parcel, i3);
                    }
                }
                gcc.o(parcel, iG3);
                return new y5h(strK, strK7, u5hVar, zW);
            case 3:
                int iG4 = gcc.G(parcel);
                while (parcel.dataPosition() < iG4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        gcc.B(parcel, i4);
                    } else {
                        arrayListN2 = gcc.n(parcel, i4, y5h.CREATOR);
                    }
                }
                gcc.o(parcel, iG4);
                return new b6h(arrayListN2);
            case 4:
                int iG5 = gcc.G(parcel);
                int iY8 = 0;
                while (parcel.dataPosition() < iG5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iY4 = gcc.y(parcel, i5);
                    } else if (c2 != 2) {
                        gcc.B(parcel, i5);
                    } else {
                        iY8 = gcc.y(parcel, i5);
                    }
                }
                gcc.o(parcel, iG5);
                return new f6h(iY4, iY8);
            case 5:
                int iG6 = gcc.G(parcel);
                za5[] za5VarArr = null;
                ik2 ik2Var = null;
                while (parcel.dataPosition() < iG6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        bundleF = gcc.f(parcel, i6);
                    } else if (c3 == 2) {
                        za5VarArr = (za5[]) gcc.m(parcel, i6, za5.CREATOR);
                    } else if (c3 == 3) {
                        iY3 = gcc.y(parcel, i6);
                    } else if (c3 != 4) {
                        gcc.B(parcel, i6);
                    } else {
                        ik2Var = (ik2) gcc.j(parcel, i6, ik2.CREATOR);
                    }
                }
                gcc.o(parcel, iG6);
                y4h y4hVar = new y4h();
                y4hVar.a = bundleF;
                y4hVar.b = za5VarArr;
                y4hVar.c = iY3;
                y4hVar.d = ik2Var;
                return y4hVar;
            case 6:
                int iG7 = gcc.G(parcel);
                byte[] bArrG3 = null;
                byte[] bArrG4 = null;
                byte[] bArrG5 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iG7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 2) {
                        bArrG3 = gcc.g(parcel, i7);
                    } else if (c4 == 3) {
                        bArrG4 = gcc.g(parcel, i7);
                    } else if (c4 == 4) {
                        bArrG5 = gcc.g(parcel, i7);
                    } else if (c4 != 5) {
                        gcc.B(parcel, i7);
                    } else {
                        int iA = gcc.A(parcel, i7);
                        int iDataPosition = parcel.dataPosition();
                        if (iA == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iA);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                gcc.o(parcel, iG7);
                return new xl0(bArrG3, bArrG4, bArrG5, strArr);
            case 7:
                int iG8 = gcc.G(parcel);
                boolean zW3 = false;
                boolean zW4 = false;
                int iY9 = 0;
                n6c n6cVar = null;
                int[] iArrI3 = null;
                int[] iArrI4 = null;
                while (parcel.dataPosition() < iG8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            n6cVar = (n6c) gcc.j(parcel, i8, n6c.CREATOR);
                            break;
                        case 2:
                            zW3 = gcc.w(parcel, i8);
                            break;
                        case 3:
                            zW4 = gcc.w(parcel, i8);
                            break;
                        case 4:
                            iArrI3 = gcc.i(parcel, i8);
                            break;
                        case 5:
                            iY9 = gcc.y(parcel, i8);
                            break;
                        case 6:
                            iArrI4 = gcc.i(parcel, i8);
                            break;
                        default:
                            gcc.B(parcel, i8);
                            break;
                    }
                }
                gcc.o(parcel, iG8);
                return new ik2(n6cVar, zW3, zW4, iArrI3, iY9, iArrI4);
            case 8:
                int iG9 = gcc.G(parcel);
                int iY10 = 0;
                while (parcel.dataPosition() < iG9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 2) {
                        iY2 = gcc.y(parcel, i9);
                    } else if (c5 == 3) {
                        strK3 = gcc.k(parcel, i9);
                    } else if (c5 != 4) {
                        gcc.B(parcel, i9);
                    } else {
                        iY10 = gcc.y(parcel, i9);
                    }
                }
                gcc.o(parcel, iG9);
                return new yl0(iY2, iY10, strK3);
            case 9:
                int iG10 = gcc.G(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = n76.Z;
                za5[] za5VarArr2 = n76.E0;
                za5[] za5VarArr3 = za5VarArr2;
                int iY11 = 0;
                int iY12 = 0;
                int iY13 = 0;
                boolean zW5 = false;
                int iY14 = 0;
                boolean zW6 = false;
                String strK8 = null;
                IBinder iBinderX = null;
                Account account = null;
                String strK9 = null;
                while (parcel.dataPosition() < iG10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iY11 = gcc.y(parcel, i10);
                            break;
                        case 2:
                            iY12 = gcc.y(parcel, i10);
                            break;
                        case 3:
                            iY13 = gcc.y(parcel, i10);
                            break;
                        case 4:
                            strK8 = gcc.k(parcel, i10);
                            break;
                        case 5:
                            iBinderX = gcc.x(parcel, i10);
                            break;
                        case 6:
                            scopeArr = (Scope[]) gcc.m(parcel, i10, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = gcc.f(parcel, i10);
                            break;
                        case '\b':
                            account = (Account) gcc.j(parcel, i10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            gcc.B(parcel, i10);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            za5VarArr2 = (za5[]) gcc.m(parcel, i10, za5.CREATOR);
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            za5VarArr3 = (za5[]) gcc.m(parcel, i10, za5.CREATOR);
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            zW5 = gcc.w(parcel, i10);
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            iY14 = gcc.y(parcel, i10);
                            break;
                        case 14:
                            zW6 = gcc.w(parcel, i10);
                            break;
                        case 15:
                            strK9 = gcc.k(parcel, i10);
                            break;
                    }
                }
                gcc.o(parcel, iG10);
                return new n76(iY11, iY12, iY13, strK8, iBinderX, scopeArr, bundle, account, za5VarArr2, za5VarArr3, zW5, iY14, zW6, strK9);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                int iG11 = gcc.G(parcel);
                while (parcel.dataPosition() < iG11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strK2 = gcc.k(parcel, i11);
                    } else if (c6 == 2) {
                        jZ = gcc.z(parcel, i11);
                    } else if (c6 != 3) {
                        gcc.B(parcel, i11);
                    } else {
                        iY = gcc.y(parcel, i11);
                    }
                }
                gcc.o(parcel, iG11);
                return new kbh(iY, jZ, strK2);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                int iG12 = gcc.G(parcel);
                long jZ3 = 0;
                long jZ4 = 0;
                int iY15 = 0;
                byte[] bArrG6 = null;
                String strK10 = null;
                Bundle bundleF2 = null;
                String strK11 = null;
                while (parcel.dataPosition() < iG12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            jZ3 = gcc.z(parcel, i12);
                            break;
                        case 2:
                            bArrG6 = gcc.g(parcel, i12);
                            break;
                        case 3:
                            strK10 = gcc.k(parcel, i12);
                            break;
                        case 4:
                            bundleF2 = gcc.f(parcel, i12);
                            break;
                        case 5:
                            iY15 = gcc.y(parcel, i12);
                            break;
                        case 6:
                            jZ4 = gcc.z(parcel, i12);
                            break;
                        case 7:
                            strK11 = gcc.k(parcel, i12);
                            break;
                        default:
                            gcc.B(parcel, i12);
                            break;
                    }
                }
                gcc.o(parcel, iG12);
                return new qbh(jZ3, bArrG6, strK10, bundleF2, iY15, jZ4, strK11);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                int iG13 = gcc.G(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iG13) {
                            gcc.o(parcel, iG13);
                            return new sbh(arrayList);
                        }
                        int i13 = parcel.readInt();
                        if (((char) i13) != 1) {
                            gcc.B(parcel, i13);
                        } else {
                            int iA2 = gcc.A(parcel, i13);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iA2 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i14 = parcel.readInt();
                            for (int i15 = 0; i15 < i14; i15++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iA2);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iG14 = gcc.G(parcel);
                while (parcel.dataPosition() < iG14) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        gcc.B(parcel, i16);
                    } else {
                        arrayListN = gcc.n(parcel, i16, qbh.CREATOR);
                    }
                }
                gcc.o(parcel, iG14);
                return new vbh(arrayListN);
            case 14:
                int iG15 = gcc.G(parcel);
                long jZ5 = 0;
                int iY16 = 0;
                String strK12 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strK13 = null;
                String strK14 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iG15) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iY16 = gcc.y(parcel, i17);
                            break;
                        case 2:
                            strK12 = gcc.k(parcel, i17);
                            break;
                        case 3:
                            jZ5 = gcc.z(parcel, i17);
                            break;
                        case 4:
                            int iA3 = gcc.A(parcel, i17);
                            if (iA3 == 0) {
                                lValueOf = null;
                            } else {
                                gcc.J(parcel, iA3, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iA4 = gcc.A(parcel, i17);
                            if (iA4 == 0) {
                                fValueOf = null;
                            } else {
                                gcc.J(parcel, iA4, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strK13 = gcc.k(parcel, i17);
                            break;
                        case 7:
                            strK14 = gcc.k(parcel, i17);
                            break;
                        case '\b':
                            int iA5 = gcc.A(parcel, i17);
                            if (iA5 == 0) {
                                dValueOf = null;
                            } else {
                                gcc.J(parcel, iA5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            gcc.B(parcel, i17);
                            break;
                    }
                }
                gcc.o(parcel, iG15);
                return new mch(iY16, strK12, jZ5, lValueOf, fValueOf, strK13, strK14, dValueOf);
            case 15:
                int iG16 = gcc.G(parcel);
                long jZ6 = -1;
                int iY17 = 0;
                int iY18 = 0;
                boolean zW7 = false;
                String strK15 = null;
                while (parcel.dataPosition() < iG16) {
                    int i18 = parcel.readInt();
                    char c7 = (char) i18;
                    if (c7 == 1) {
                        zW7 = gcc.w(parcel, i18);
                    } else if (c7 == 2) {
                        strK15 = gcc.k(parcel, i18);
                    } else if (c7 == 3) {
                        iY17 = gcc.y(parcel, i18);
                    } else if (c7 == 4) {
                        iY18 = gcc.y(parcel, i18);
                    } else if (c7 != 5) {
                        gcc.B(parcel, i18);
                    } else {
                        jZ6 = gcc.z(parcel, i18);
                    }
                }
                gcc.o(parcel, iG16);
                return new ldh(iY17, iY18, jZ6, strK15, zW7);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iG17 = gcc.G(parcel);
                String strK16 = "";
                String strK17 = strK16;
                String strK18 = strK17;
                String strK19 = strK18;
                int iY19 = 100;
                long jZ7 = 0;
                long jZ8 = 0;
                long jZ9 = 0;
                long jZ10 = 0;
                long jZ11 = 0;
                long jZ12 = 0;
                long jZ13 = 0;
                long jZ14 = 0;
                boolean zW8 = true;
                boolean zW9 = true;
                boolean zW10 = false;
                int iY20 = 0;
                boolean zW11 = false;
                boolean zW12 = false;
                int iY21 = 0;
                int iY22 = 0;
                String strK20 = null;
                String strK21 = null;
                String strK22 = null;
                String strK23 = null;
                String strK24 = null;
                String strK25 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListL = null;
                String strK26 = null;
                String strK27 = null;
                long jZ15 = -2147483648L;
                while (parcel.dataPosition() < iG17) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strK20 = gcc.k(parcel, i19);
                            break;
                        case 3:
                            strK21 = gcc.k(parcel, i19);
                            break;
                        case 4:
                            strK22 = gcc.k(parcel, i19);
                            break;
                        case 5:
                            strK23 = gcc.k(parcel, i19);
                            break;
                        case 6:
                            jZ7 = gcc.z(parcel, i19);
                            break;
                        case 7:
                            jZ8 = gcc.z(parcel, i19);
                            break;
                        case '\b':
                            strK24 = gcc.k(parcel, i19);
                            break;
                        case '\t':
                            zW8 = gcc.w(parcel, i19);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            zW10 = gcc.w(parcel, i19);
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            jZ15 = gcc.z(parcel, i19);
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            strK25 = gcc.k(parcel, i19);
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            gcc.B(parcel, i19);
                            break;
                        case 14:
                            jZ9 = gcc.z(parcel, i19);
                            break;
                        case 15:
                            iY20 = gcc.y(parcel, i19);
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            zW9 = gcc.w(parcel, i19);
                            break;
                        case 18:
                            zW11 = gcc.w(parcel, i19);
                            break;
                        case 21:
                            int iA6 = gcc.A(parcel, i19);
                            if (iA6 == 0) {
                                boolValueOf = null;
                            } else {
                                gcc.J(parcel, iA6, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jZ10 = gcc.z(parcel, i19);
                            break;
                        case 23:
                            arrayListL = gcc.l(parcel, i19);
                            break;
                        case 25:
                            strK16 = gcc.k(parcel, i19);
                            break;
                        case 26:
                            strK17 = gcc.k(parcel, i19);
                            break;
                        case 27:
                            strK26 = gcc.k(parcel, i19);
                            break;
                        case 28:
                            zW12 = gcc.w(parcel, i19);
                            break;
                        case 29:
                            jZ11 = gcc.z(parcel, i19);
                            break;
                        case 30:
                            iY19 = gcc.y(parcel, i19);
                            break;
                        case 31:
                            strK18 = gcc.k(parcel, i19);
                            break;
                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                            iY21 = gcc.y(parcel, i19);
                            break;
                        case '\"':
                            jZ12 = gcc.z(parcel, i19);
                            break;
                        case '#':
                            strK27 = gcc.k(parcel, i19);
                            break;
                        case '$':
                            strK19 = gcc.k(parcel, i19);
                            break;
                        case '%':
                            jZ13 = gcc.z(parcel, i19);
                            break;
                        case '&':
                            iY22 = gcc.y(parcel, i19);
                            break;
                        case '\'':
                            jZ14 = gcc.z(parcel, i19);
                            break;
                    }
                }
                gcc.o(parcel, iG17);
                return new ndh(strK20, strK21, strK22, strK23, jZ7, jZ8, strK24, zW8, zW10, jZ15, strK25, jZ9, iY20, zW9, zW11, boolValueOf, jZ10, arrayListL, strK16, strK17, strK26, zW12, jZ11, iY19, strK18, iY21, jZ12, strK27, strK19, jZ13, iY22, jZ14);
            case 17:
                try {
                    return by4.b(parcel.readInt());
                } catch (zx4 e) {
                    throw new IllegalArgumentException(e);
                }
            default:
                int iG18 = gcc.G(parcel);
                int iY23 = 0;
                String strK28 = null;
                String strK29 = null;
                String strK30 = null;
                String strK31 = null;
                String strK32 = null;
                String strK33 = null;
                while (parcel.dataPosition() < iG18) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strK28 = gcc.k(parcel, i20);
                            break;
                        case 2:
                            strK29 = gcc.k(parcel, i20);
                            break;
                        case 3:
                            strK30 = gcc.k(parcel, i20);
                            break;
                        case 4:
                            strK31 = gcc.k(parcel, i20);
                            break;
                        case 5:
                            strK32 = gcc.k(parcel, i20);
                            break;
                        case 6:
                            iY23 = gcc.y(parcel, i20);
                            break;
                        case 7:
                            strK33 = gcc.k(parcel, i20);
                            break;
                        default:
                            gcc.B(parcel, i20);
                            break;
                    }
                }
                gcc.o(parcel, iG18);
                return new wob(strK28, strK29, strK30, strK31, strK32, iY23, strK33);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new r5h[i];
            case 1:
                return new u5h[i];
            case 2:
                return new y5h[i];
            case 3:
                return new b6h[i];
            case 4:
                return new f6h[i];
            case 5:
                return new y4h[i];
            case 6:
                return new xl0[i];
            case 7:
                return new ik2[i];
            case 8:
                return new yl0[i];
            case 9:
                return new n76[i];
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new kbh[i];
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new qbh[i];
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new sbh[i];
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new vbh[i];
            case 14:
                return new mch[i];
            case 15:
                return new ldh[i];
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new ndh[i];
            case 17:
                return new by4[i];
            default:
                return new wob[i];
        }
    }
}
