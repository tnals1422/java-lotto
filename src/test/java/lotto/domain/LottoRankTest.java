package lotto.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoRankTest {

	@Test
	@DisplayName("로또 순위 별 매칭 개수 테스트")
	public void getMatches() {
		assertThat(LottoRank.FIRST.getMatches()).isEqualTo(6);
		assertThat(LottoRank.SECOND.getMatches()).isEqualTo(5);
		assertThat(LottoRank.THIRD.getMatches()).isEqualTo(4);
		assertThat(LottoRank.FOURTH.getMatches()).isEqualTo(3);
		assertThat(LottoRank.UNRANKED.getMatches()).isEqualTo(0);
	}

	@Test
	@DisplayName("로또 순위 별 보상 값 테스트")
	public void getReward() {
		assertThat(LottoRank.FIRST.getReward()).isEqualTo(2000000000);
		assertThat(LottoRank.SECOND.getReward()).isEqualTo(1500000);
		assertThat(LottoRank.THIRD.getReward()).isEqualTo(50000);
		assertThat(LottoRank.FOURTH.getReward()).isEqualTo(5000);
		assertThat(LottoRank.UNRANKED.getReward()).isEqualTo(0);
	}

	@Test
	@DisplayName("로또 순위 매칭 개수에 따른 로또 순위 확인 테스트")
	public void valueOf() {
		assertThat(LottoRank.valueOf(6)).isEqualTo(LottoRank.FIRST);
		assertThat(LottoRank.valueOf(5)).isEqualTo(LottoRank.SECOND);
		assertThat(LottoRank.valueOf(4)).isEqualTo(LottoRank.THIRD);
		assertThat(LottoRank.valueOf(3)).isEqualTo(LottoRank.FOURTH);
		assertThat(LottoRank.valueOf(0)).isEqualTo(LottoRank.UNRANKED);
	}

}