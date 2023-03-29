package in12;

public class Radio  implements Sound{
		private int SndLevel;
		
		public void Tv() {
			SndLevel=0;
		}
		@Override
		public void SoundUp(int level) {
			// TODO Auto-generated method stub
			SndLevel+=level;
			System.out.println("radio 볼륨이 증가");
		}
		@Override
		public void SoundDown(int level) {
			// TODO Auto-generated method stub
			SndLevel-=level;
			if(SndLevel<0)
				SndLevel=0;
			System.out.println("radio 볼륨이 감소");
		}
	}
