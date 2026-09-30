package defpackage;

import android.graphics.Color;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class khe implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public khe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        int iRed = Color.red(iIntValue);
        int i = this.a;
        int i2 = iRed - i;
        int iGreen = Color.green(iIntValue);
        int i3 = this.b;
        int i4 = iGreen - i3;
        int iBlue = Color.blue(iIntValue);
        int i5 = this.c;
        int i6 = iBlue - i5;
        int i7 = i6 * i6;
        Integer numValueOf = Integer.valueOf(i7 + (i4 * i4) + (i2 * i2));
        int iIntValue2 = ((Number) obj).intValue();
        int iRed2 = Color.red(iIntValue2) - i;
        int iGreen2 = Color.green(iIntValue2) - i3;
        int iBlue2 = Color.blue(iIntValue2) - i5;
        return numValueOf.compareTo(Integer.valueOf((iBlue2 * iBlue2) + (iGreen2 * iGreen2) + (iRed2 * iRed2)));
    }
}
