package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rz9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY = 0;
        boolean zW = false;
        boolean zW2 = false;
        int iY2 = 0;
        int iY3 = 0;
        int iY4 = 0;
        int iY5 = 0;
        PendingIntent pendingIntent = null;
        byte[] bArrG = null;
        String strK = null;
        PendingIntent pendingIntent2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        ArrayList arrayListL = null;
        ArrayList arrayListN = null;
        Intent intent = null;
        ArrayList arrayListN2 = null;
        Bundle bundleF = null;
        PendingIntent pendingIntent3 = null;
        switch (this.a) {
            case 0:
                return new sz9(parcel.readInt());
            case 1:
                return new tz9(parcel.readLong());
            case 2:
                int iG = gcc.G(parcel);
                while (parcel.dataPosition() < iG) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        gcc.B(parcel, i);
                    } else {
                        pendingIntent = (PendingIntent) gcc.j(parcel, i, PendingIntent.CREATOR);
                    }
                }
                gcc.o(parcel, iG);
                return new p6a(pendingIntent);
            case 3:
                int iG2 = gcc.G(parcel);
                while (parcel.dataPosition() < iG2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        gcc.B(parcel, i2);
                    } else {
                        pendingIntent3 = (PendingIntent) gcc.j(parcel, i2, PendingIntent.CREATOR);
                    }
                }
                gcc.o(parcel, iG2);
                return new q6a(pendingIntent3);
            case 4:
                return new n8a(parcel);
            case 5:
                int iG3 = gcc.G(parcel);
                while (parcel.dataPosition() < iG3) {
                    gcc.B(parcel, parcel.readInt());
                }
                gcc.o(parcel, iG3);
                return new uob();
            case 6:
                int iG4 = gcc.G(parcel);
                while (parcel.dataPosition() < iG4) {
                    gcc.B(parcel, parcel.readInt());
                }
                gcc.o(parcel, iG4);
                return new vob();
            case 7:
                int iG5 = gcc.G(parcel);
                while (parcel.dataPosition() < iG5) {
                    gcc.B(parcel, parcel.readInt());
                }
                gcc.o(parcel, iG5);
                return new xob();
            case 8:
                int iG6 = gcc.G(parcel);
                while (parcel.dataPosition() < iG6) {
                    gcc.B(parcel, parcel.readInt());
                }
                gcc.o(parcel, iG6);
                return new mid();
            case 9:
                iyd iydVar = new iyd();
                iydVar.a = parcel.readInt();
                iydVar.b = parcel.readInt();
                iydVar.d = parcel.readInt() == 1;
                int i3 = parcel.readInt();
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    iydVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return iydVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                jyd jydVar = new jyd();
                jydVar.a = parcel.readInt();
                jydVar.b = parcel.readInt();
                int i4 = parcel.readInt();
                jydVar.c = i4;
                if (i4 > 0) {
                    int[] iArr2 = new int[i4];
                    jydVar.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i5 = parcel.readInt();
                jydVar.e = i5;
                if (i5 > 0) {
                    int[] iArr3 = new int[i5];
                    jydVar.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                jydVar.v = parcel.readInt() == 1;
                jydVar.w = parcel.readInt() == 1;
                jydVar.x = parcel.readInt() == 1;
                jydVar.g = parcel.readArrayList(iyd.class.getClassLoader());
                return jydVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new oye(parcel.readLong(), parcel.readLong());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new Trace(parcel, false);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int iG7 = gcc.G(parcel);
                int iY6 = 0;
                while (parcel.dataPosition() < iG7) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iY = gcc.y(parcel, i6);
                    } else if (c == 2) {
                        iY6 = gcc.y(parcel, i6);
                    } else if (c != 3) {
                        gcc.B(parcel, i6);
                    } else {
                        bundleF = gcc.f(parcel, i6);
                    }
                }
                gcc.o(parcel, iG7);
                return new uc6(iY, iY6, bundleF);
            case 14:
                int iG8 = gcc.G(parcel);
                while (parcel.dataPosition() < iG8) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        iY5 = gcc.y(parcel, i7);
                    } else if (c2 != 2) {
                        gcc.B(parcel, i7);
                    } else {
                        arrayListN2 = gcc.n(parcel, i7, mv8.CREATOR);
                    }
                }
                gcc.o(parcel, iG8);
                return new ole(iY5, arrayListN2);
            case 15:
                int iG9 = gcc.G(parcel);
                int iY7 = 0;
                while (parcel.dataPosition() < iG9) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iY4 = gcc.y(parcel, i8);
                    } else if (c3 == 2) {
                        iY7 = gcc.y(parcel, i8);
                    } else if (c3 != 3) {
                        gcc.B(parcel, i8);
                    } else {
                        intent = (Intent) gcc.j(parcel, i8, Intent.CREATOR);
                    }
                }
                gcc.o(parcel, iG9);
                return new mhg(iY4, iY7, intent);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iG10 = gcc.G(parcel);
                long jZ = 0;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                String strK5 = null;
                Uri uri = null;
                String strK6 = null;
                String strK7 = null;
                ArrayList arrayListN3 = null;
                String strK8 = null;
                String strK9 = null;
                while (parcel.dataPosition() < iG10) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            strK2 = gcc.k(parcel, i9);
                            break;
                        case 3:
                            strK3 = gcc.k(parcel, i9);
                            break;
                        case 4:
                            strK4 = gcc.k(parcel, i9);
                            break;
                        case 5:
                            strK5 = gcc.k(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) gcc.j(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strK6 = gcc.k(parcel, i9);
                            break;
                        case '\b':
                            jZ = gcc.z(parcel, i9);
                            break;
                        case '\t':
                            strK7 = gcc.k(parcel, i9);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            arrayListN3 = gcc.n(parcel, i9, Scope.CREATOR);
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            strK8 = gcc.k(parcel, i9);
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            strK9 = gcc.k(parcel, i9);
                            break;
                        default:
                            gcc.B(parcel, i9);
                            break;
                    }
                }
                gcc.o(parcel, iG10);
                return new GoogleSignInAccount(strK2, strK3, strK4, strK5, uri, strK6, jZ, strK7, arrayListN3, strK8, strK9);
            case 17:
                int iG11 = gcc.G(parcel);
                long jZ2 = 0;
                int iY8 = 0;
                int iY9 = 0;
                boolean zW3 = false;
                String strK10 = null;
                while (parcel.dataPosition() < iG11) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iY8 = gcc.y(parcel, i10);
                    } else if (c4 == 2) {
                        strK10 = gcc.k(parcel, i10);
                    } else if (c4 == 3) {
                        jZ2 = gcc.z(parcel, i10);
                    } else if (c4 == 4) {
                        iY9 = gcc.y(parcel, i10);
                    } else if (c4 != 5) {
                        gcc.B(parcel, i10);
                    } else {
                        zW3 = gcc.w(parcel, i10);
                    }
                }
                gcc.o(parcel, iG11);
                return new ohg(iY8, iY9, jZ2, strK10, zW3);
            case 18:
                int iG12 = gcc.G(parcel);
                int iY10 = 0;
                boolean zW4 = false;
                boolean zW5 = false;
                boolean zW6 = false;
                ArrayList arrayListN4 = null;
                Account account2 = null;
                String strK11 = null;
                String strK12 = null;
                String strK13 = null;
                while (parcel.dataPosition() < iG12) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iY10 = gcc.y(parcel, i11);
                            break;
                        case 2:
                            arrayListN4 = gcc.n(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) gcc.j(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zW4 = gcc.w(parcel, i11);
                            break;
                        case 5:
                            zW5 = gcc.w(parcel, i11);
                            break;
                        case 6:
                            zW6 = gcc.w(parcel, i11);
                            break;
                        case 7:
                            strK11 = gcc.k(parcel, i11);
                            break;
                        case '\b':
                            strK12 = gcc.k(parcel, i11);
                            break;
                        case '\t':
                            arrayListN = gcc.n(parcel, i11, uc6.CREATOR);
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            strK13 = gcc.k(parcel, i11);
                            break;
                        default:
                            gcc.B(parcel, i11);
                            break;
                    }
                }
                gcc.o(parcel, iG12);
                return new GoogleSignInOptions(iY10, arrayListN4, account2, zW4, zW5, zW6, strK11, strK12, GoogleSignInOptions.d(arrayListN), strK13);
            case 19:
                int iG13 = gcc.G(parcel);
                String strK14 = null;
                while (parcel.dataPosition() < iG13) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        arrayListL = gcc.l(parcel, i12);
                    } else if (c5 != 2) {
                        gcc.B(parcel, i12);
                    } else {
                        strK14 = gcc.k(parcel, i12);
                    }
                }
                gcc.o(parcel, iG13);
                return new jig(strK14, arrayListL);
            case 20:
                int iG14 = gcc.G(parcel);
                wig wigVar = null;
                while (parcel.dataPosition() < iG14) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iY3 = gcc.y(parcel, i13);
                    } else if (c6 == 2) {
                        connectionResult = (ConnectionResult) gcc.j(parcel, i13, ConnectionResult.CREATOR);
                    } else if (c6 != 3) {
                        gcc.B(parcel, i13);
                    } else {
                        wigVar = (wig) gcc.j(parcel, i13, wig.CREATOR);
                    }
                }
                gcc.o(parcel, iG14);
                return new rig(iY3, connectionResult, wigVar);
            case 21:
                int iG15 = gcc.G(parcel);
                int iY11 = -1;
                long jZ3 = 0;
                long jZ4 = 0;
                int iY12 = 0;
                int iY13 = 0;
                int iY14 = 0;
                int iY15 = 0;
                String strK15 = null;
                String strK16 = null;
                while (parcel.dataPosition() < iG15) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iY12 = gcc.y(parcel, i14);
                            break;
                        case 2:
                            iY13 = gcc.y(parcel, i14);
                            break;
                        case 3:
                            iY14 = gcc.y(parcel, i14);
                            break;
                        case 4:
                            jZ3 = gcc.z(parcel, i14);
                            break;
                        case 5:
                            jZ4 = gcc.z(parcel, i14);
                            break;
                        case 6:
                            strK15 = gcc.k(parcel, i14);
                            break;
                        case 7:
                            strK16 = gcc.k(parcel, i14);
                            break;
                        case '\b':
                            iY15 = gcc.y(parcel, i14);
                            break;
                        case '\t':
                            iY11 = gcc.y(parcel, i14);
                            break;
                        default:
                            gcc.B(parcel, i14);
                            break;
                    }
                }
                gcc.o(parcel, iG15);
                return new mv8(iY12, iY13, iY14, jZ3, jZ4, strK15, strK16, iY15, iY11);
            case 22:
                int iG16 = gcc.G(parcel);
                int iY16 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iG16) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        iY2 = gcc.y(parcel, i15);
                    } else if (c7 == 2) {
                        account = (Account) gcc.j(parcel, i15, Account.CREATOR);
                    } else if (c7 == 3) {
                        iY16 = gcc.y(parcel, i15);
                    } else if (c7 != 4) {
                        gcc.B(parcel, i15);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) gcc.j(parcel, i15, GoogleSignInAccount.CREATOR);
                    }
                }
                gcc.o(parcel, iG16);
                return new vig(iY2, account, iY16, googleSignInAccount2);
            case 23:
                int iG17 = gcc.G(parcel);
                int iY17 = 0;
                boolean zW7 = false;
                boolean zW8 = false;
                IBinder iBinderX = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iG17) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iY17 = gcc.y(parcel, i16);
                    } else if (c8 == 2) {
                        iBinderX = gcc.x(parcel, i16);
                    } else if (c8 == 3) {
                        connectionResult2 = (ConnectionResult) gcc.j(parcel, i16, ConnectionResult.CREATOR);
                    } else if (c8 == 4) {
                        zW7 = gcc.w(parcel, i16);
                    } else if (c8 != 5) {
                        gcc.B(parcel, i16);
                    } else {
                        zW8 = gcc.w(parcel, i16);
                    }
                }
                gcc.o(parcel, iG17);
                return new wig(iY17, iBinderX, connectionResult2, zW7, zW8);
            case 24:
                int iG18 = gcc.G(parcel);
                String strK17 = "";
                String strK18 = "";
                while (parcel.dataPosition() < iG18) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 4) {
                        strK17 = gcc.k(parcel, i17);
                    } else if (c9 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) gcc.j(parcel, i17, GoogleSignInAccount.CREATOR);
                    } else if (c9 != '\b') {
                        gcc.B(parcel, i17);
                    } else {
                        strK18 = gcc.k(parcel, i17);
                    }
                }
                gcc.o(parcel, iG18);
                return new SignInAccount(strK17, googleSignInAccount, strK18);
            case 25:
                int iG19 = gcc.G(parcel);
                boolean zW9 = false;
                int iY18 = 0;
                boolean zW10 = false;
                dx0 dx0Var = null;
                ax0 ax0Var = null;
                String strK19 = null;
                cx0 cx0Var = null;
                bx0 bx0Var = null;
                while (parcel.dataPosition() < iG19) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            dx0Var = (dx0) gcc.j(parcel, i18, dx0.CREATOR);
                            break;
                        case 2:
                            ax0Var = (ax0) gcc.j(parcel, i18, ax0.CREATOR);
                            break;
                        case 3:
                            strK19 = gcc.k(parcel, i18);
                            break;
                        case 4:
                            zW9 = gcc.w(parcel, i18);
                            break;
                        case 5:
                            iY18 = gcc.y(parcel, i18);
                            break;
                        case 6:
                            cx0Var = (cx0) gcc.j(parcel, i18, cx0.CREATOR);
                            break;
                        case 7:
                            bx0Var = (bx0) gcc.j(parcel, i18, bx0.CREATOR);
                            break;
                        case '\b':
                            zW10 = gcc.w(parcel, i18);
                            break;
                        default:
                            gcc.B(parcel, i18);
                            break;
                    }
                }
                gcc.o(parcel, iG19);
                return new ex0(dx0Var, ax0Var, strK19, zW9, iY18, cx0Var, bx0Var, zW10);
            case 26:
                int iG20 = gcc.G(parcel);
                while (parcel.dataPosition() < iG20) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        gcc.B(parcel, i19);
                    } else {
                        pendingIntent2 = (PendingIntent) gcc.j(parcel, i19, PendingIntent.CREATOR);
                    }
                }
                gcc.o(parcel, iG20);
                return new fx0(pendingIntent2);
            case 27:
                int iG21 = gcc.G(parcel);
                boolean zW11 = false;
                boolean zW12 = false;
                boolean zW13 = false;
                String strK20 = null;
                String strK21 = null;
                String strK22 = null;
                ArrayList arrayListL2 = null;
                while (parcel.dataPosition() < iG21) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            zW11 = gcc.w(parcel, i20);
                            break;
                        case 2:
                            strK20 = gcc.k(parcel, i20);
                            break;
                        case 3:
                            strK21 = gcc.k(parcel, i20);
                            break;
                        case 4:
                            zW12 = gcc.w(parcel, i20);
                            break;
                        case 5:
                            strK22 = gcc.k(parcel, i20);
                            break;
                        case 6:
                            arrayListL2 = gcc.l(parcel, i20);
                            break;
                        case 7:
                            zW13 = gcc.w(parcel, i20);
                            break;
                        default:
                            gcc.B(parcel, i20);
                            break;
                    }
                }
                gcc.o(parcel, iG21);
                return new ax0(zW11, strK20, strK21, zW12, strK22, arrayListL2, zW13);
            case 28:
                int iG22 = gcc.G(parcel);
                while (parcel.dataPosition() < iG22) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 1) {
                        zW2 = gcc.w(parcel, i21);
                    } else if (c10 != 2) {
                        gcc.B(parcel, i21);
                    } else {
                        strK = gcc.k(parcel, i21);
                    }
                }
                gcc.o(parcel, iG22);
                return new bx0(zW2, strK);
            default:
                int iG23 = gcc.G(parcel);
                String strK23 = null;
                while (parcel.dataPosition() < iG23) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        zW = gcc.w(parcel, i22);
                    } else if (c11 == 2) {
                        bArrG = gcc.g(parcel, i22);
                    } else if (c11 != 3) {
                        gcc.B(parcel, i22);
                    } else {
                        strK23 = gcc.k(parcel, i22);
                    }
                }
                gcc.o(parcel, iG23);
                return new cx0(zW, bArrG, strK23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sz9[i];
            case 1:
                return new tz9[i];
            case 2:
                return new p6a[i];
            case 3:
                return new q6a[i];
            case 4:
                return new n8a[i];
            case 5:
                return new uob[i];
            case 6:
                return new vob[i];
            case 7:
                return new xob[i];
            case 8:
                return new mid[i];
            case 9:
                return new iyd[i];
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new jyd[i];
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new oye[i];
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new Trace[i];
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new uc6[i];
            case 14:
                return new ole[i];
            case 15:
                return new mhg[i];
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new GoogleSignInAccount[i];
            case 17:
                return new ohg[i];
            case 18:
                return new GoogleSignInOptions[i];
            case 19:
                return new jig[i];
            case 20:
                return new rig[i];
            case 21:
                return new mv8[i];
            case 22:
                return new vig[i];
            case 23:
                return new wig[i];
            case 24:
                return new SignInAccount[i];
            case 25:
                return new ex0[i];
            case 26:
                return new fx0[i];
            case 27:
                return new ax0[i];
            case 28:
                return new bx0[i];
            default:
                return new cx0[i];
        }
    }
}
