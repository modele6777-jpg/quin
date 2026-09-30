package defpackage;

import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderTarget;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d82 {
    public final /* synthetic */ int a;
    public long b;

    public d82(hj6 hj6Var) {
        this.a = 11;
        oa7.A(hj6Var);
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                long j = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused) {
                }
                ColorGrading.nDestroyBuilder(j);
                break;
            case 1:
                long j2 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused2) {
                }
                Engine.nDestroyBuilder(j2);
                break;
            case 2:
            case 5:
            case 6:
            default:
                super.finalize();
                break;
            case 3:
                long j3 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused3) {
                }
                IndexBuffer.nDestroyBuilder(j3);
                break;
            case 4:
                long j4 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused4) {
                }
                LightManager.nDestroyBuilder(j4);
                break;
            case 7:
                long j5 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused5) {
                }
                RenderTarget.nDestroyBuilder(j5);
                break;
            case 8:
                long j6 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused6) {
                }
                RenderableManager.nDestroyBuilder(j6);
                break;
            case 9:
                long j7 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused7) {
                }
                Texture.nDestroyBuilder(j7);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                long j8 = this.b;
                try {
                    super.finalize();
                    break;
                } catch (Throwable unused8) {
                }
                VertexBuffer.nDestroyBuilder(j8);
                break;
        }
    }

    public /* synthetic */ d82(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ d82(boolean z) {
        this.a = 5;
    }

    public d82() {
        this.a = 5;
        this.b = Long.MIN_VALUE;
    }
}
