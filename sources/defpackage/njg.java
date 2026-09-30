package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class njg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ njg(int i) {
        this.a = i;
    }

    public static void a(hsg hsgVar, Parcel parcel, int i) {
        String str = hsgVar.a;
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, str);
        hcc.u(parcel, 3, hsgVar.b, i);
        hcc.v(parcel, 4, hsgVar.c);
        long j = hsgVar.d;
        hcc.z(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = hsgVar.e;
        hcc.z(parcel, 6, 8);
        parcel.writeLong(j2);
        hcc.C(parcel, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zW = false;
        int iY = 0;
        boolean zW2 = false;
        boolean zW3 = false;
        int iY2 = 0;
        int iY3 = 0;
        int iY4 = 0;
        int iY5 = 0;
        int iY6 = 0;
        String strK = null;
        byte[] bArrG = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        Bundle bundleF = null;
        ArrayList arrayListN = null;
        Bundle bundleF2 = null;
        Intent intent = null;
        switch (this.a) {
            case 0:
                int iG = gcc.G(parcel);
                while (parcel.dataPosition() < iG) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        gcc.B(parcel, i);
                    } else {
                        zW = gcc.w(parcel, i);
                    }
                }
                gcc.o(parcel, iG);
                return new dx0(zW);
            case 1:
                int iG2 = gcc.G(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iG2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 2) {
                        strK = gcc.k(parcel, i2);
                    } else if (c != 5) {
                        gcc.B(parcel, i2);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) gcc.j(parcel, i2, GoogleSignInOptions.CREATOR);
                    }
                }
                gcc.o(parcel, iG2);
                return new SignInConfiguration(strK, googleSignInOptions);
            case 2:
                int iG3 = gcc.G(parcel);
                String strK5 = null;
                String strK6 = null;
                String strK7 = null;
                String strK8 = null;
                Uri uri = null;
                String strK9 = null;
                String strK10 = null;
                String strK11 = null;
                j2b j2bVar = null;
                while (parcel.dataPosition() < iG3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            strK5 = gcc.k(parcel, i3);
                            break;
                        case 2:
                            strK6 = gcc.k(parcel, i3);
                            break;
                        case 3:
                            strK7 = gcc.k(parcel, i3);
                            break;
                        case 4:
                            strK8 = gcc.k(parcel, i3);
                            break;
                        case 5:
                            uri = (Uri) gcc.j(parcel, i3, Uri.CREATOR);
                            break;
                        case 6:
                            strK9 = gcc.k(parcel, i3);
                            break;
                        case 7:
                            strK10 = gcc.k(parcel, i3);
                            break;
                        case '\b':
                            strK11 = gcc.k(parcel, i3);
                            break;
                        case '\t':
                            j2bVar = (j2b) gcc.j(parcel, i3, j2b.CREATOR);
                            break;
                        default:
                            gcc.B(parcel, i3);
                            break;
                    }
                }
                gcc.o(parcel, iG3);
                return new kgd(strK5, strK6, strK7, strK8, uri, strK9, strK10, strK11, j2bVar);
            case 3:
                int iG4 = gcc.G(parcel);
                while (parcel.dataPosition() < iG4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        gcc.B(parcel, i4);
                    } else {
                        intent = (Intent) gcc.j(parcel, i4, Intent.CREATOR);
                    }
                }
                gcc.o(parcel, iG4);
                return new i62(intent);
            case 4:
                int iG5 = gcc.G(parcel);
                int iY7 = 0;
                int iY8 = 0;
                PendingIntent pendingIntent = null;
                String strK12 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iG5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iY7 = gcc.y(parcel, i5);
                    } else if (c2 == 2) {
                        iY8 = gcc.y(parcel, i5);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) gcc.j(parcel, i5, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        strK12 = gcc.k(parcel, i5);
                    } else if (c2 != 5) {
                        gcc.B(parcel, i5);
                    } else {
                        int iA = gcc.A(parcel, i5);
                        if (iA == 0) {
                            numValueOf = null;
                        } else {
                            gcc.J(parcel, iA, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                gcc.o(parcel, iG5);
                return new ConnectionResult(iY7, iY8, pendingIntent, strK12, numValueOf);
            case 5:
                int iG6 = gcc.G(parcel);
                int iY9 = 0;
                boolean zW4 = false;
                boolean zW5 = false;
                int iY10 = 0;
                int iY11 = 0;
                while (parcel.dataPosition() < iG6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iY9 = gcc.y(parcel, i6);
                    } else if (c3 == 2) {
                        zW4 = gcc.w(parcel, i6);
                    } else if (c3 == 3) {
                        zW5 = gcc.w(parcel, i6);
                    } else if (c3 == 4) {
                        iY10 = gcc.y(parcel, i6);
                    } else if (c3 != 5) {
                        gcc.B(parcel, i6);
                    } else {
                        iY11 = gcc.y(parcel, i6);
                    }
                }
                gcc.o(parcel, iG6);
                return new n6c(iY9, zW4, zW5, iY10, iY11);
            case 6:
                int iG7 = gcc.G(parcel);
                long jZ = 0;
                long jZ2 = 0;
                int iY12 = 0;
                while (parcel.dataPosition() < iG7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        jZ = gcc.z(parcel, i7);
                    } else if (c4 == 2) {
                        iY12 = gcc.y(parcel, i7);
                    } else if (c4 != 3) {
                        gcc.B(parcel, i7);
                    } else {
                        jZ2 = gcc.z(parcel, i7);
                    }
                }
                gcc.o(parcel, iG7);
                return new mng(jZ, iY12, jZ2);
            case 7:
                int iG8 = gcc.G(parcel);
                long jZ3 = 0;
                long jZ4 = 0;
                long jZ5 = 0;
                boolean zW6 = false;
                String strK13 = null;
                String strK14 = null;
                mch mchVar = null;
                String strK15 = null;
                hsg hsgVar = null;
                hsg hsgVar2 = null;
                hsg hsgVar3 = null;
                while (parcel.dataPosition() < iG8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            strK13 = gcc.k(parcel, i8);
                            break;
                        case 3:
                            strK14 = gcc.k(parcel, i8);
                            break;
                        case 4:
                            mchVar = (mch) gcc.j(parcel, i8, mch.CREATOR);
                            break;
                        case 5:
                            jZ3 = gcc.z(parcel, i8);
                            break;
                        case 6:
                            zW6 = gcc.w(parcel, i8);
                            break;
                        case 7:
                            strK15 = gcc.k(parcel, i8);
                            break;
                        case '\b':
                            hsgVar = (hsg) gcc.j(parcel, i8, hsg.CREATOR);
                            break;
                        case '\t':
                            jZ4 = gcc.z(parcel, i8);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            hsgVar2 = (hsg) gcc.j(parcel, i8, hsg.CREATOR);
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            jZ5 = gcc.z(parcel, i8);
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            hsgVar3 = (hsg) gcc.j(parcel, i8, hsg.CREATOR);
                            break;
                        default:
                            gcc.B(parcel, i8);
                            break;
                    }
                }
                gcc.o(parcel, iG8);
                return new wog(strK13, strK14, mchVar, jZ3, zW6, strK15, hsgVar, jZ4, hsgVar2, jZ5, hsgVar3);
            case 8:
                int iG9 = gcc.G(parcel);
                String strK16 = null;
                String strK17 = null;
                byte[] bArrG2 = null;
                xl0 xl0Var = null;
                wl0 wl0Var = null;
                yl0 yl0Var = null;
                ul0 ul0Var = null;
                String strK18 = null;
                while (parcel.dataPosition() < iG9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strK16 = gcc.k(parcel, i9);
                            break;
                        case 2:
                            strK17 = gcc.k(parcel, i9);
                            break;
                        case 3:
                            bArrG2 = gcc.g(parcel, i9);
                            break;
                        case 4:
                            xl0Var = (xl0) gcc.j(parcel, i9, xl0.CREATOR);
                            break;
                        case 5:
                            wl0Var = (wl0) gcc.j(parcel, i9, wl0.CREATOR);
                            break;
                        case 6:
                            yl0Var = (yl0) gcc.j(parcel, i9, yl0.CREATOR);
                            break;
                        case 7:
                            ul0Var = (ul0) gcc.j(parcel, i9, ul0.CREATOR);
                            break;
                        case '\b':
                            strK18 = gcc.k(parcel, i9);
                            break;
                        case '\t':
                            gcc.k(parcel, i9);
                            break;
                        default:
                            gcc.B(parcel, i9);
                            break;
                    }
                }
                gcc.o(parcel, iG9);
                return new j2b(strK16, strK17, bArrG2, xl0Var, wl0Var, yl0Var, ul0Var, strK18);
            case 9:
                int iG10 = gcc.G(parcel);
                while (parcel.dataPosition() < iG10) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        gcc.B(parcel, i10);
                    } else {
                        bundleF2 = gcc.f(parcel, i10);
                    }
                }
                gcc.o(parcel, iG10);
                return new wqg(bundleF2);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new tjg((PendingIntent) parcel.readParcelable(q0c.class.getClassLoader()), parcel.readInt() != 0);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new cwg(parcel.readStrongBinder());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                int iG11 = gcc.G(parcel);
                long jZ6 = -1;
                int iY13 = 0;
                boolean zW7 = false;
                String strK19 = null;
                while (parcel.dataPosition() < iG11) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        strK19 = gcc.k(parcel, i11);
                    } else if (c5 == 2) {
                        iY13 = gcc.y(parcel, i11);
                    } else if (c5 == 3) {
                        jZ6 = gcc.z(parcel, i11);
                    } else if (c5 != 4) {
                        gcc.B(parcel, i11);
                    } else {
                        zW7 = gcc.w(parcel, i11);
                    }
                }
                gcc.o(parcel, iG11);
                return new za5(strK19, iY13, jZ6, zW7);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iG12 = gcc.G(parcel);
                while (parcel.dataPosition() < iG12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        gcc.B(parcel, i12);
                    } else {
                        arrayListN = gcc.n(parcel, i12, krf.CREATOR);
                    }
                }
                gcc.o(parcel, iG12);
                return new jrf(arrayListN);
            case 14:
                int iG13 = gcc.G(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iG13) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iY6 = gcc.y(parcel, i13);
                    } else if (c6 == 2) {
                        gcc.I(parcel, i13, 4);
                        s = (short) parcel.readInt();
                    } else if (c6 != 3) {
                        gcc.B(parcel, i13);
                    } else {
                        gcc.I(parcel, i13, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                gcc.o(parcel, iG13);
                return new krf(iY6, s, s2);
            case 15:
                int iG14 = gcc.G(parcel);
                while (parcel.dataPosition() < iG14) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        gcc.B(parcel, i14);
                    } else {
                        bundleF = gcc.f(parcel, i14);
                    }
                }
                gcc.o(parcel, iG14);
                return new esg(bundleF);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iG15 = gcc.G(parcel);
                long jZ7 = 0;
                long jZ8 = 0;
                String strK20 = null;
                esg esgVar = null;
                String strK21 = null;
                while (parcel.dataPosition() < iG15) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 2) {
                        strK20 = gcc.k(parcel, i15);
                    } else if (c7 == 3) {
                        esgVar = (esg) gcc.j(parcel, i15, esg.CREATOR);
                    } else if (c7 == 4) {
                        strK21 = gcc.k(parcel, i15);
                    } else if (c7 == 5) {
                        jZ7 = gcc.z(parcel, i15);
                    } else if (c7 != 6) {
                        gcc.B(parcel, i15);
                    } else {
                        jZ8 = gcc.z(parcel, i15);
                    }
                }
                gcc.o(parcel, iG15);
                return new hsg(strK20, esgVar, strK21, jZ7, jZ8);
            case 17:
                int iG16 = gcc.G(parcel);
                int iY14 = 0;
                int iY15 = 0;
                boolean zW8 = true;
                while (parcel.dataPosition() < iG16) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iY5 = gcc.y(parcel, i16);
                    } else if (c8 == 2) {
                        iY14 = gcc.y(parcel, i16);
                    } else if (c8 == 3) {
                        iY15 = gcc.y(parcel, i16);
                    } else if (c8 != 4) {
                        gcc.B(parcel, i16);
                    } else {
                        zW8 = gcc.w(parcel, i16);
                    }
                }
                gcc.o(parcel, iG16);
                return new ib2(iY5, iY14, iY15, zW8);
            case 18:
                int iG17 = gcc.G(parcel);
                jrf jrfVar = null;
                zxg zxgVar = null;
                vl0 vl0Var = null;
                i1h i1hVar = null;
                String strK22 = null;
                while (parcel.dataPosition() < iG17) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        jrfVar = (jrf) gcc.j(parcel, i17, jrf.CREATOR);
                    } else if (c9 == 2) {
                        zxgVar = (zxg) gcc.j(parcel, i17, zxg.CREATOR);
                    } else if (c9 == 3) {
                        vl0Var = (vl0) gcc.j(parcel, i17, vl0.CREATOR);
                    } else if (c9 == 4) {
                        i1hVar = (i1h) gcc.j(parcel, i17, i1h.CREATOR);
                    } else if (c9 != 5) {
                        gcc.B(parcel, i17);
                    } else {
                        strK22 = gcc.k(parcel, i17);
                    }
                }
                gcc.o(parcel, iG17);
                return new ul0(jrfVar, zxgVar, vl0Var, i1hVar, strK22);
            case 19:
                int iG18 = gcc.G(parcel);
                while (parcel.dataPosition() < iG18) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        iY4 = gcc.y(parcel, i18);
                    } else if (c10 != 2) {
                        gcc.B(parcel, i18);
                    } else {
                        strK4 = gcc.k(parcel, i18);
                    }
                }
                gcc.o(parcel, iG18);
                return new Scope(iY4, strK4);
            case 20:
                int iG19 = gcc.G(parcel);
                long jZ9 = 0;
                long jZ10 = 0;
                boolean zW9 = false;
                Bundle bundleF3 = null;
                String strK23 = null;
                while (parcel.dataPosition() < iG19) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        jZ9 = gcc.z(parcel, i19);
                    } else if (c11 == 2) {
                        jZ10 = gcc.z(parcel, i19);
                    } else if (c11 == 3) {
                        zW9 = gcc.w(parcel, i19);
                    } else if (c11 == 7) {
                        bundleF3 = gcc.f(parcel, i19);
                    } else if (c11 != '\b') {
                        gcc.B(parcel, i19);
                    } else {
                        strK23 = gcc.k(parcel, i19);
                    }
                }
                gcc.o(parcel, iG19);
                return new gwg(jZ9, jZ10, zW9, bundleF3, strK23);
            case 21:
                int iG20 = gcc.G(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < iG20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iY3 = gcc.y(parcel, i20);
                    } else if (c12 == 2) {
                        strK3 = gcc.k(parcel, i20);
                    } else if (c12 != 3) {
                        gcc.B(parcel, i20);
                    } else {
                        intent2 = (Intent) gcc.j(parcel, i20, Intent.CREATOR);
                    }
                }
                gcc.o(parcel, iG20);
                return new iwg(iY3, strK3, intent2);
            case 22:
                int iG21 = gcc.G(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iG21) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        iY2 = gcc.y(parcel, i21);
                    } else if (c13 == 2) {
                        strK2 = gcc.k(parcel, i21);
                    } else if (c13 == 3) {
                        pendingIntent2 = (PendingIntent) gcc.j(parcel, i21, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        gcc.B(parcel, i21);
                    } else {
                        connectionResult = (ConnectionResult) gcc.j(parcel, i21, ConnectionResult.CREATOR);
                    }
                }
                gcc.o(parcel, iG21);
                return new Status(iY2, strK2, pendingIntent2, connectionResult);
            case 23:
                int iG22 = gcc.G(parcel);
                while (parcel.dataPosition() < iG22) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        gcc.B(parcel, i22);
                    } else {
                        zW3 = gcc.w(parcel, i22);
                    }
                }
                gcc.o(parcel, iG22);
                return new vl0(zW3);
            case 24:
                int iG23 = gcc.G(parcel);
                byte[] bArrG3 = null;
                byte[] bArrG4 = null;
                while (parcel.dataPosition() < iG23) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        bArrG3 = gcc.g(parcel, i23);
                    } else if (c14 != 2) {
                        gcc.B(parcel, i23);
                    } else {
                        bArrG4 = gcc.g(parcel, i23);
                    }
                }
                gcc.o(parcel, iG23);
                return new zxg(bArrG3 == null ? null : d1h.k(bArrG3, bArrG3.length), bArrG4 != null ? d1h.k(bArrG4, bArrG4.length) : null);
            case 25:
                int iG24 = gcc.G(parcel);
                byte[] bArrG5 = null;
                while (parcel.dataPosition() < iG24) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        zW2 = gcc.w(parcel, i24);
                    } else if (c15 != 2) {
                        gcc.B(parcel, i24);
                    } else {
                        bArrG5 = gcc.g(parcel, i24);
                    }
                }
                gcc.o(parcel, iG24);
                return new i1h(zW2, bArrG5 != null ? d1h.k(bArrG5, bArrG5.length) : null);
            case 26:
                int iG25 = gcc.G(parcel);
                byte[] bArrG6 = null;
                byte[] bArrG7 = null;
                byte[] bArrG8 = null;
                byte[] bArrG9 = null;
                byte[] bArrG10 = null;
                while (parcel.dataPosition() < iG25) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 2) {
                        bArrG6 = gcc.g(parcel, i25);
                    } else if (c16 == 3) {
                        bArrG7 = gcc.g(parcel, i25);
                    } else if (c16 == 4) {
                        bArrG8 = gcc.g(parcel, i25);
                    } else if (c16 == 5) {
                        bArrG9 = gcc.g(parcel, i25);
                    } else if (c16 != 6) {
                        gcc.B(parcel, i25);
                    } else {
                        bArrG10 = gcc.g(parcel, i25);
                    }
                }
                gcc.o(parcel, iG25);
                return new wl0(bArrG6, bArrG7, bArrG8, bArrG9, bArrG10);
            case 27:
                int iG26 = gcc.G(parcel);
                u5h[] u5hVarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iG26) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        iY = gcc.y(parcel, i26);
                    } else if (c17 == 3) {
                        u5hVarArr = (u5h[]) gcc.m(parcel, i26, u5h.CREATOR);
                    } else if (c17 != 4) {
                        gcc.B(parcel, i26);
                    } else {
                        int iA2 = gcc.A(parcel, i26);
                        int iDataPosition = parcel.dataPosition();
                        if (iA2 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iA2);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                gcc.o(parcel, iG26);
                return new h5h(iY, u5hVarArr, strArr);
            case 28:
                int iG27 = gcc.G(parcel);
                long jZ11 = 0;
                boolean zW10 = false;
                String strK24 = null;
                String strK25 = null;
                h5h[] h5hVarArr = null;
                byte[] bArrG11 = null;
                while (parcel.dataPosition() < iG27) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            strK24 = gcc.k(parcel, i27);
                            break;
                        case 3:
                            strK25 = gcc.k(parcel, i27);
                            break;
                        case 4:
                            h5hVarArr = (h5h[]) gcc.m(parcel, i27, h5h.CREATOR);
                            break;
                        case 5:
                            zW10 = gcc.w(parcel, i27);
                            break;
                        case 6:
                            bArrG11 = gcc.g(parcel, i27);
                            break;
                        case 7:
                            jZ11 = gcc.z(parcel, i27);
                            break;
                        default:
                            gcc.B(parcel, i27);
                            break;
                    }
                }
                gcc.o(parcel, iG27);
                return new j5h(strK24, strK25, h5hVarArr, zW10, bArrG11, jZ11);
            default:
                int iG28 = gcc.G(parcel);
                while (parcel.dataPosition() < iG28) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        gcc.B(parcel, i28);
                    } else {
                        bArrG = gcc.g(parcel, i28);
                    }
                }
                gcc.o(parcel, iG28);
                return new n5h(bArrG);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dx0[i];
            case 1:
                return new SignInConfiguration[i];
            case 2:
                return new kgd[i];
            case 3:
                return new i62[i];
            case 4:
                return new ConnectionResult[i];
            case 5:
                return new n6c[i];
            case 6:
                return new mng[i];
            case 7:
                return new wog[i];
            case 8:
                return new j2b[i];
            case 9:
                return new wqg[i];
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new q0c[i];
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new cwg[i];
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new za5[i];
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new jrf[i];
            case 14:
                return new krf[i];
            case 15:
                return new esg[i];
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new hsg[i];
            case 17:
                return new ib2[i];
            case 18:
                return new ul0[i];
            case 19:
                return new Scope[i];
            case 20:
                return new gwg[i];
            case 21:
                return new iwg[i];
            case 22:
                return new Status[i];
            case 23:
                return new vl0[i];
            case 24:
                return new zxg[i];
            case 25:
                return new i1h[i];
            case 26:
                return new wl0[i];
            case 27:
                return new h5h[i];
            case 28:
                return new j5h[i];
            default:
                return new n5h[i];
        }
    }
}
