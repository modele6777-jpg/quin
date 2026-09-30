package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.qtf;
import defpackage.rtf;
import defpackage.stf;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(qtf qtfVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        stf stfVarG = remoteActionCompat.a;
        boolean z = true;
        if (qtfVar.e(1)) {
            stfVarG = qtfVar.g();
        }
        remoteActionCompat.a = (IconCompat) stfVarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (qtfVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rtf) qtfVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (qtfVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((rtf) qtfVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) qtfVar.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (qtfVar.e(5)) {
            z2 = ((rtf) qtfVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!qtfVar.e(6)) {
            z = z3;
        } else if (((rtf) qtfVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, qtf qtfVar) {
        qtfVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        qtfVar.h(1);
        qtfVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        qtfVar.h(2);
        Parcel parcel = ((rtf) qtfVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        qtfVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        qtfVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        qtfVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        qtfVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
