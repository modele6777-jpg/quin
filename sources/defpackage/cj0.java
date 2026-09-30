package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cj0 extends AudioDeviceCallback {
    public final /* synthetic */ ej0 a;

    public cj0(ej0 ej0Var) {
        this.a = ej0Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.d();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ej0 ej0Var = this.a;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) ej0Var.x;
        String str = pqf.a;
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo2, audioDeviceInfo)) {
                ej0Var.x = null;
                break;
            }
        }
        ej0Var.d();
    }
}
